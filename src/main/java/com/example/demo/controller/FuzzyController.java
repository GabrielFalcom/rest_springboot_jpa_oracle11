package com.example.demo.controller;

import com.example.demo.model.Country;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class FuzzyController {

    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = "/fuzzy", method = RequestMethod.GET)
    @ResponseBody
    public List fuzzy() {
        Query query = entityManager.createQuery("SELECT COUNTRY_NAME, CITY, DEPARTMENT_NAME, FIRST_NAME FROM HR.COUNTRIES JOIN HR.LOCATIONS USING (COUNTRY_ID) JOIN HR.DEPARTMENTS USING (LOCATION_ID) JOIN HR.EMPLOYEES E on HR.DEPARTMENTS.DEPARTMENT_ID = E.DEPARTMENT_ID");

        return query.getResultList();
    }
}
