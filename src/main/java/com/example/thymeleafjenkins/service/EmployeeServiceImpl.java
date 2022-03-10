package com.example.thymeleafjenkins.service;

import com.example.thymeleafjenkins.model.Employee;
import com.example.thymeleafjenkins.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository customerRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Employee> getAllEmployee() {
        // TODO Auto-generated method stub
        return customerRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee customer) {
        // TODO Auto-generated method stub
        return customerRepository.save(customer);	}

    @Override
    public Employee getEmployee(Integer id) {
        // TODO Auto-generated method stub
        return customerRepository.getById(id);
    }

    @Override
    public void deleteEmployee(Integer id) {
        // TODO Auto-generated method stub
        Employee customer=customerRepository.getById(id);
        customerRepository.delete(customer);
    }

}