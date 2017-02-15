package andrii.model;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.util.List;
import static andrii.dataBase.DB_Connector.getJdbcTemplate;

public abstract class DB_Handler {

    public static List<Dog> selectDogs() {
        return getJdbcTemplate().query("select id, name, breed from pet",
                BeanPropertyRowMapper.newInstance(Dog.class));
    }
}
