package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.JobHistory;
import com.example.demo.service.CountryService;
import com.example.demo.service.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/jobHistory")
public class JobHistoryController {

    @Autowired
    JobHistoryService jobHistoryService;

    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<JobHistory> getAllJobHistories() {
        List<JobHistory> jobHistories = jobHistoryService.getAllJobHistories();
        return jobHistories;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JobHistory getJobHistory(@PathVariable("id") String id) {
        Query query = entityManager.createQuery("from JobHistory where JOB_ID = :id");
        query.setParameter("id",id);
        JobHistory jobHistory = (JobHistory) query.getSingleResult();
        return jobHistory;
    }
}
