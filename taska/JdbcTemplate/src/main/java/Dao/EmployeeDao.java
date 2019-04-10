package Dao;

import User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User get(Integer id) {
        String sql = "SELECT id, name password FROM USER WHERE id = ?";//根据id数查询数据
        //BeanPropertyRowMapper可自动将一行数据映射到指定类的实例中 它首先将这个类实例化，然后通过名称匹配的方式，映射到属性中去
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
      return jdbcTemplate.queryForObject(sql, rowMapper, id);//返回根据id查询的行数据
    }
}
