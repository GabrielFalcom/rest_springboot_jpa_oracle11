package com.example.demo.service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.dao.RegionsDao;
import com.example.demo.model.Department;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    public List<Department> getAllDepartments() {
        return this.departmentDao.findAll();
    }

    public Department getDepartment(Integer id) { return this.departmentDao.findById(id).get(); }
}
