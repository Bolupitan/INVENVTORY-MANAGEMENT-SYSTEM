package com.stockhub.InventoryManagementSystem.dto.order.Request;

import java.time.LocalDate;

public class CreateOutgoingOrderRequestDto {

    private String productName ;

    private Integer productId ;

    private String address ;

    private String contactPhone ;

    private LocalDate orderDate ;

    private  double discount ;

    private Integer quantityOrder ;


    public CreateOutgoingOrderRequestDto(String productName, Integer productId, String address, String contactPhone, LocalDate orderDate, double discount, Integer quantityOrder) {
        this.productName = productName;
        this.productId = productId;
        this.address = address;
        this.contactPhone = contactPhone ;
        this.orderDate = orderDate;
        this.discount = discount;
        this.quantityOrder = quantityOrder;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(Integer quantityOrder) {
        this.quantityOrder = quantityOrder;
    }
}
