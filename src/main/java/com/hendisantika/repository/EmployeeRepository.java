package com.hendisantika.repository;

import com.hendisantika.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
}
