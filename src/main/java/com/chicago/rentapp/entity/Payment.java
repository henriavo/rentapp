package com.chicago.rentapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Payment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String payType;
    private Integer payAmmount;
    private Date payTxDate;
    private Date payDueDate;

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
