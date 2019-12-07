package com.example.demo.service;

import com.example.demo.dao.JobsDao;
import com.example.demo.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobsDao jobsDao;

    public List<Job> getAllJobs() {
        return this.jobsDao.findAll();
    }
}
