package com.example.thymeleafjenkins.service;

import com.example.thymeleafjenkins.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee customer);

    public List<Employee> getAllEmployee();

    public Employee getEmployee(Integer id);

    public void deleteEmployee(Integer id);

}
