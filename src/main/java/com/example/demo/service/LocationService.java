package com.example.demo.service;

import com.example.demo.dao.LocationDao;
import com.example.demo.model.Country;
import com.example.demo.model.Location;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    LocationDao locationDao;

    public List<Location> getAllLocations() {
        return this.locationDao.findAll();
    }

    public Location getLocation(Integer id) { return this.locationDao.findById(id).get(); }
}
