package com.stockhub.InventoryManagementSystem.dto.productDTO.Response;

import java.time.LocalDate;

public class ProductResponseDTO {

    private String productName;

    private Integer categoryId;

    private Integer unitPrice;

    private LocalDate DateCreated;

//


    public ProductResponseDTO(String productName, Integer categoryId, Integer unitPrice, LocalDate dateCreated) {
        this.productName = productName;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
        DateCreated = dateCreated;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = productName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        DateCreated = dateCreated;
    }
}
