package com.example.liveasy.liveasy.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.liveasy.liveasy.entities.Loads;
import com.example.liveasy.liveasy.services.LoadService;


@RestController
public class Control {

    @Autowired
    private LoadService loadService;
    

    @GetMapping("/home")
    public String home(){
        return "Application is Running.";
    }

    @GetMapping("/loads")
    public List<Loads> getLoads(){
        return this.loadService.getLoads();
    }

    @GetMapping("/load/{loadid}")
    public Optional<Loads> getLoad(@PathVariable String loadid){
        
        return this.loadService.getLoad(Long.parseLong(loadid));
    }

    @PostMapping("/load")
    public String postLoad(@RequestBody Loads load){
        this.loadService.addLoad(load);
        return "Load Details Added Succesfully";
    }

    @DeleteMapping("load/{loadId}")
    public String deleteLoad(@PathVariable String loadId){
        this.loadService.deleteLoad(Long.parseLong(loadId));
        return "Load Deleted Succesfully";
    }

    @PutMapping("load/{loadId}")
    public String updateLoad(@RequestBody Loads load){
        this.loadService.updateLoad(load);
        return "Load Details Updated Succesfully";
    }

    @GetMapping("/load")
    public List<Loads> getByParam(@RequestParam("shipperid") Long shipperid){
        return loadService.getByParam(shipperid);
    }
}


