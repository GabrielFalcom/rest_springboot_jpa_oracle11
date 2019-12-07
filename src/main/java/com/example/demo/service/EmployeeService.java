package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.JobsDao;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return this.employeeDao.findAll();
    }

    public Employee getEmployee(Integer id) { return this.employeeDao.findById(id).get(); }
}
