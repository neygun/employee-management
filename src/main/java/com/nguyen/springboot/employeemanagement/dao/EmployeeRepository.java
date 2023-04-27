package com.nguyen.springboot.employeemanagement.dao;

import com.nguyen.springboot.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE %?1% OR e.lastName LIKE %?1%")
    public List<Employee> findByKeyword(String keyword);
}
