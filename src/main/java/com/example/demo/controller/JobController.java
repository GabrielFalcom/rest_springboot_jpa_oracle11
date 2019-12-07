package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.model.Job;
import com.example.demo.model.Region;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    JobService jobService;

    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Job> getAllJobs() {
        List<Job> jobs = jobService.getAllJobs();
        return jobs;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Job getJob(@PathVariable("id") String id) {
        Query query = entityManager.createQuery("from Job where JOB_ID = :id");
        query.setParameter("id",id);
        Job job = (Job) query.getSingleResult();
        return job;
    }
}
