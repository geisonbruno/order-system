package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.Order;

import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private String orderStatus;
    private UserDTO client;
    private Set<OrderItemDTO> items;
    private PaymentDTO payment;
    private Double total;


    public OrderDTO(Order order) {
        this.id = order.getId();
        this.moment = order.getMoment();
        this.orderStatus = order.getOrderStatus().name();
        this.client = new UserDTO(order.getClient());
        this.items = order.getItems().stream().map(OrderItemDTO::new).collect(Collectors.toSet());
        this.payment = order.getPayment() != null ? new PaymentDTO(order.getPayment()) : null;
        this.total = order.getTotal();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public UserDTO getClient() {
        return client;
    }

    public Set<OrderItemDTO> getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }

    public PaymentDTO getPayment() {
        return payment;
    }
}
