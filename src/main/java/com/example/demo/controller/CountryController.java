package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.Employee;
import com.example.demo.service.CountryService;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @PersistenceContext
    private EntityManager entityManager;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> getAllContries() {
        List<Country> countries = countryService.getAllCountries();
        return countries;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Country getCountry(@PathVariable("id") String id) {
        Query query = entityManager.createQuery("from Country where COUNTRY_ID = :id");
        query.setParameter("id",id);
        Country country = (Country) query.getSingleResult();
        return country;
    }
}
