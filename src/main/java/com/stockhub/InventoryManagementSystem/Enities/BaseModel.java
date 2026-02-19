package com.stockhub.InventoryManagementSystem.Enities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public class BaseModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




}
