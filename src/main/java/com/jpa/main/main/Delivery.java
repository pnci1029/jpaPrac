package com.jpa.main.main;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity{
    @Id
    @Column(name = "delivery_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String zipCode;
    private DeliveryStatus deliveryStatus;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
