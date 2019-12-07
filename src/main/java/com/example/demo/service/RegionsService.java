package com.example.demo.service;

import com.example.demo.dao.JobsDao;
import com.example.demo.dao.RegionsDao;
import com.example.demo.model.Country;
import com.example.demo.model.Job;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionsService {

    @Autowired
    RegionsDao regionsDao;

    public List<Region> getAlRegions() {
        return this.regionsDao.findAll();
    }

    public Region getRegion(Integer id) { return this.regionsDao.findById(id).get(); }

    public void addRegion(Region region) {  this.regionsDao.saveAndFlush(region); }

    public void editRegion(Region region) {  this.regionsDao.saveAndFlush(region); }

    public void removeRegion(Integer id) {  this.regionsDao.deleteById(id); }
}
