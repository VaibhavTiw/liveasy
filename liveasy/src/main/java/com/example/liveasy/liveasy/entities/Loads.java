package com.example.liveasy.liveasy.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Loads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loadId;
    private long shipperid;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private double weight;
    private String comments;
    private String date;



    public Loads(long loadId, long shipperid, String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, double weight, String comments, String date){
        super();
        this.loadId = loadId;
        this.shipperid = shipperid;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comments = comments;
        this.date = date;
    }

}


