package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.Department;
import com.example.demo.model.Region;
import com.example.demo.service.CountryService;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Department> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        return departments;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Department getDepartment(@PathVariable("id") int id) {
        Department department = departmentService.getDepartment(id);
        return department;
    }
}
