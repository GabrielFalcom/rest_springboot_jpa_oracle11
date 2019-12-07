package com.example.demo.service;

import com.example.demo.dao.JobHistoryDao;
import com.example.demo.model.Country;
import com.example.demo.model.JobHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryService {

    @Autowired
    JobHistoryDao jobHistoryDao;

    public List<JobHistory> getAllJobHistories() {
        return this.jobHistoryDao.findAll();
    }
}
