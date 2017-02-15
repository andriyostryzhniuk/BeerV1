package andrii.dataBase;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

public class DB_Connector {

    private static DataSource dataSource;
    private static JdbcTemplate jdbcTemplate;
    private static NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public DB_Connector() {
    }

    public static DataSource getDataSource() {
        // double check locking
        if (dataSource == null) {
            synchronized (DB_Connector.class) {
                if (dataSource == null) {
                    dataSource = createDataSource("127.0.0.1",
                            "3306",
                            "dogs",
                            "root",
                            "qwerty");
                }
            }
        }
        return dataSource;
    }

    private static DataSource createDataSource(String address,
                                               String port,
                                               String dbName,
                                               String dbUser,
                                               String dbPassword) {
        try {
            ComboPooledDataSource c3p0 = new ComboPooledDataSource();
            c3p0.setDriverClass("com.mysql.jdbc.Driver");
            c3p0.setJdbcUrl(String.format("jdbc:mysql://%s:%s/%s", address, port, dbName));
            c3p0.setUser(dbUser);
            c3p0.setPassword(dbPassword);
            return c3p0;
        } catch (PropertyVetoException e) {
            throw new RuntimeException();
        }
    }
}