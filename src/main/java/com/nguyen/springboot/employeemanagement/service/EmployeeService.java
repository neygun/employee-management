package com.nguyen.springboot.employeemanagement.service;

import com.nguyen.springboot.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);

    public List<Employee> searchEmployees(String keyword);

    public List<Employee> findAllWithSort(String field, String direction);
}
