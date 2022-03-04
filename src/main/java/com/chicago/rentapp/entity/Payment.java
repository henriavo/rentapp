package com.chicago.rentapp.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

public class Payment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String payType;
    private Integer payAmmount;
    private Date payTxDate;
    private Date payDueDate;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(nullable = false, updatable = true)
    @UpdateTimestamp
    private Timestamp updatedTimestamp;

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", payType='" + payType + '\'' +
                ", payAmmount='" + payAmmount + '\'' +
                ", payTxDate='" + payTxDate + '\'' +
                ", payDueDate='" + payDueDate + '\'' +
                '}';
    }
}
