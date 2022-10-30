package com.hendisantika.controller;

import com.hendisantika.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-jdbc-hr-project
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/27/22
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/count")
    public long countEmp() {
        return employeeService.count();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id, @RequestHeader("accept-language") String acceptLanguage) {
        log.info(" Accept Language is " + acceptLanguage);
        return ResponseEntity.ok(employeeService.findById(id));
    }
}
