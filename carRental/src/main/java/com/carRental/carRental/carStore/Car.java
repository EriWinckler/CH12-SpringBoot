package com.carRental.carRental.carStore;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
    private @Id @GeneratedValue Long id;
    private String carModel;

    public Car() {}

    public Car(String carModel) {
        this.carModel = carModel;
    }

    public Car(long id, String carModel) {
        this.id = id;
        this.carModel = carModel;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

}
