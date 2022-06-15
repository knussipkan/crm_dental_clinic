package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "payment", schema = "public", catalog = "CRM")
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id")
    private long paymentId;

    @Column(name = "date_payment")
    private Date datePayment;

    @Column(name = "summ")
    private double summ;

    @Column(name = "commentss")
    private String commentss;

}
