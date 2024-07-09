package com.hisyam.springboot.demo.mycoolapp.service;

import com.hisyam.springboot.demo.mycoolapp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
