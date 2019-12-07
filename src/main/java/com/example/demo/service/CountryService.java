package com.example.demo.service;

import com.example.demo.dao.CountryDao;
import com.example.demo.model.Country;
import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryDao countryDao;

    public List<Country> getAllCountries() {
        return this.countryDao.findAll();
    }

}
