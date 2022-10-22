package com.hendisantika.mapper;

import com.hendisantika.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-jdbc-hr-project
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/22/22
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Employee(rs.getLong("id"), rs.getString("name"), rs.getDouble("salary"), rs.getString("is_create"));
    }
}
