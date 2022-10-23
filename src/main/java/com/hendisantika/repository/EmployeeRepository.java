package com.hendisantika.repository;

import com.hendisantika.entity.Employee;
import com.hendisantika.mapper.EmployeeMapper;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-jdbc-hr-project
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/23/22
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByName(String name);

    List<Employee> findByEmployeeId(String name);

    @Query(value = "SELECT id , name, salary, 'true' as is_create FROM employees where name"
            + " like :empName and salary >= :empSalary", rowMapperClass = EmployeeMapper.class)
    List<Employee> findByNameAndSalary(@Param("empName") String name, @Param("empSalary") Double salary);


    @Modifying
    @Query(value = "update employees set salary = :salary where id = :id ")
    int updateSalary(Double salary, Long id);
}
