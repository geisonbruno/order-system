package com.geisonbruno.demo.dto;

import com.geisonbruno.demo.entities.Payment;

import java.time.Instant;

public class PaymentDTO {

    private Long id;
    private Instant moment;

    public PaymentDTO(Payment payment) {
        this.id = payment.getId();
        this.moment = payment.getMoment();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

}
