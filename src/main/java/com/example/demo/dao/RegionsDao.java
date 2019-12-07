package com.example.demo.dao;

import com.example.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RegionsDao extends JpaRepository<Region, Integer> {

}
