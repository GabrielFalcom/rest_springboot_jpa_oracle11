package com.example.demo.dao;

import com.example.demo.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsDao extends JpaRepository<Job, Integer> {

}
