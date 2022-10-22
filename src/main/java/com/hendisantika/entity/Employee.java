package com.hendisantika.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-data-jdbc-hr-project
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/22/22
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 */
@Table("employees")
@Getter
@Setter
public class Employee {

    @Id
    @Column("id")
    @JsonProperty("empId")
    private Long employeeId;

    @Column("name")
    @JsonProperty("empName")
    private String name;

    private Double salary;

    @Transient
    @JsonIgnore
    private String isCreate;

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(Long employeeId, String name, Double salary, String isCreate) {
        super();
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.isCreate = isCreate;
    }

    public Employee(Long employeeId, String name) {
        super();
        this.employeeId = employeeId;
        this.name = name;
    }

}
