package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "order_services", schema = "public", catalog = "CRM")
public class OrderServices {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_service_id")
    private long orderServiceId;

    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "service_id")
    private Integer serviceId;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "total")
    private Double total;


}
