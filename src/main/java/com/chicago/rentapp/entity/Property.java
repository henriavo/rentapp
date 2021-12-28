package com.chicago.rentapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class Property {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String streetNumber;
    private String street;
    private String city;
    private String state;
    private Integer zip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property pp = (Property) o;
        return Objects.equals(id, pp.id) &&
                Objects.equals(streetNumber, pp.streetNumber) &&
                Objects.equals(street, pp.street) &&
                Objects.equals(city, pp.city) &&
                Objects.equals(state, pp.state) &&
                Objects.equals(zip, pp.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, streetNumber, street, city, state, zip);
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", streetNumber='" + streetNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
