package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.Employee;
import com.example.demo.model.Location;
import com.example.demo.service.CountryService;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Location> getAllLocations() {
        List<Location> locations = locationService.getAllLocations();
        return locations;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Location getLocation(@PathVariable("id") int id) {
        Location location = locationService.getLocation(id);
        return location;
    }
}
