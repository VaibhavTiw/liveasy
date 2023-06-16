package com.example.liveasy.liveasy.services;
import java.util.*;


import com.example.liveasy.liveasy.entities.Loads;

public interface LoadService {
    public List<Loads> getLoads();
    public Optional<Loads> getLoad(long loadid);
    public Long addLoad(Loads load);
    public void deleteLoad(Long parseLong);
    public void updateLoad(Loads load);

}
