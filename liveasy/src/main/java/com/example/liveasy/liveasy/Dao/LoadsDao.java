package com.example.liveasy.liveasy.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.liveasy.liveasy.entities.Loads;

@Repository
public interface LoadsDao extends JpaRepository<Loads, Long>{

}
