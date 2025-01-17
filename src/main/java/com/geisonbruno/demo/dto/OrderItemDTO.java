package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.OrderItem;
import com.geisonbruno.demo.entities.Product;

public class OrderItemDTO {

    private Integer quantity;
    private Double price;
    private Double subTotal;
    private ProductDTO product;

    public OrderItemDTO(OrderItem orderItem) {
        this.quantity = orderItem.getQuantity();
        this.price = orderItem.getPrice();
        this.subTotal = orderItem.getSubTotal();
        this.product = new ProductDTO(orderItem.getProduct());
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public Double getSubTotal() {
        return subTotal;
    }
}
