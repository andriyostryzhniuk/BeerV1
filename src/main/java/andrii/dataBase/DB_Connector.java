package andrii.dataBase;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

public class DB_Connector {

    private static final Logger LOGGER = LoggerFactory.getLogger(DB_Connector.class);

    private static DataSource dataSource;
    private static JdbcTemplate jdbcTemplate;

    public DB_Connector() {
    }

    public static DataSource getDataSource() {
        // double check locking
        if (dataSource == null) {
            synchronized (DB_Connector.class) {
                if (dataSource == null) {
                    LOGGER.info("dataSource created");
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

    public static JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate == null) {
            jdbcTemplate = new JdbcTemplate(getDataSource());
        }
        return jdbcTemplate;
    }
}
