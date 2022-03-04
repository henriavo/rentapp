package com.chicago.rentapp.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Lease {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String leaseStartDate;
    private String leaseEndDate;
    private Integer rentAmmount;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(nullable = false, updatable = true)
    @UpdateTimestamp
    private Timestamp updatedTimestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(String leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public String getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(String leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public Integer getRentAmmount() {
        return rentAmmount;
    }

    public void setRentAmmount(Integer rentAmmount) {
        this.rentAmmount = rentAmmount;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + id +
                ", leaseStartDate='" + leaseStartDate + '\'' +
                ", leaseEndDate='" + leaseEndDate + '\'' +
                ", rentAmmount='" + rentAmmount + '\'' +
                '}';
    }
}
