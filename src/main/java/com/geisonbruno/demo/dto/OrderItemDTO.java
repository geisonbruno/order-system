package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.OrderItem;

public class OrderItemDTO {

    private String productName;
    private Integer quantity;
    private Double price;

    public OrderItemDTO(OrderItem orderItem) {
        this.productName = orderItem.getProduct().getName();
        this.quantity = orderItem.getQuantity();
        this.price = orderItem.getPrice();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
