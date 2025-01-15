package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.Order;

import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private String clientName;
    private Set<OrderItemDTO> items;

    public OrderDTO(Order order) {
        this.id = order.getId();
        this.moment = order.getMoment();
        this.clientName = order.getClient().getName();
        this.items = order.getItems().stream().map(OrderItemDTO::new).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Set<OrderItemDTO> getItems() {
        return items;
    }

    public void setItems(Set<OrderItemDTO> items) {
        this.items = items;
    }
}
