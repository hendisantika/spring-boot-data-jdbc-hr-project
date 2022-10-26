package com.hendisantika.service;

import com.hendisantika.entity.Employee;
import com.hendisantika.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-jdbc-hr-project
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/25/22
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public long count() {
        return employeeRepository.count();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }
}
