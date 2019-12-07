package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.Job;
import com.example.demo.model.Region;
import com.example.demo.service.JobService;
import com.example.demo.service.RegionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    RegionsService regionsService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Region> getAllRegions() {
        List<Region> regions = regionsService.getAlRegions();
        return regions;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Region getRegion(@PathVariable("id") int id) {
        Region region = regionsService.getRegion(id);
        return region;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Region addRegion(@PathVariable("id") int id) {
        Region region = regionsService.getRegion(id);
        return region;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void addRegion(Region region) {
        regionsService.addRegion(region);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    @ResponseBody
    public void editRegion(Region region) {
        regionsService.editRegion(region);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteRegion(@PathVariable("id") int id) {
        regionsService.removeRegion(id);
    }
}
