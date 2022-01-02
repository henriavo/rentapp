package com.chicago.rentapp.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Resident {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobilePhone;

    public Resident(){

    }

    public Resident(String firstName, String lastName, String email, String mobilePhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resident rr = (Resident) o;
        return Objects.equals(id, rr.id) &&
                Objects.equals(firstName, rr.firstName) &&
                Objects.equals(lastName, rr.lastName) &&
                Objects.equals(email, rr.email) &&
                Objects.equals(mobilePhone, rr.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, mobilePhone);
    }

    @Override
    public String toString() {
        return "Resident{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone=" + mobilePhone +
                '}';
    }
}
