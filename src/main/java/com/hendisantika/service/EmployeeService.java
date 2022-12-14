package com.hendisantika.service;

import com.hendisantika.entity.Employee;
import com.hendisantika.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee insert(Employee emp) {
        return employeeRepository.save(emp);
    }

    public Employee update(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> findByEmployeeId(String name) {
        return employeeRepository.findByEmployeeId(name);
    }

    public List<Employee> findByNameAndSalary(@Param("empName") String name, @Param("empSalary") Double salary) {
        return employeeRepository.findByNameAndSalary(name, salary);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    public int updateSalary(Double salary, Long id) {
        return employeeRepository.updateSalary(salary, id);
    }
}
