package com.example.liveasy.liveasy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.liveasy.liveasy.Dao.LoadsDao;
import com.example.liveasy.liveasy.entities.Loads;

@Service
public class LoadServiceImpl implements LoadService {


    @Autowired
    private LoadsDao loadsDao;

    public List<Loads> getLoads(){
        return loadsDao.findAll();
    }

    public Optional<Loads> getLoad(long loadid){
        return loadsDao.findById(loadid);
    }

    public Long addLoad(Loads load){
        try {
        return loadsDao.save(load).getLoadId();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return 1l;
        
    }

    public void deleteLoad(Long loadId){
        loadsDao.deleteById(loadId);
    }

    public void updateLoad(Loads load){
            loadsDao.save(load);
        
    }

    public List<Loads> getByParam(Long shipperid){
        return loadsDao.findByShipperid(shipperid);

    }

}