package com.fastfood.fastfood.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;



@Entity
@Table(name="ELEF_ADDRESS")
public class Address {
    @Id
    @Column(name="ADDRESSID")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    @Column(name="NAME")
    private String name;

    @NotEmpty(message="Address should not be empty")
    @Length(max=30)
    @Column(name="LINE1")
    private String line1;

    @Length(max=30)
    @Column(name="LINE2")
    private String line2;

    @NotEmpty(message="City should not be empty")
    @Length(max=20)
    @Column(name="CITY")
    private String city;


    @Length(max=30)
    @Column(name="LANDMARK")
    private String landmark;

    @NotEmpty(message="Mobile Number should not be empty")
    @Length(max=40)
    @Column(name="MOBILENUMBER")
    private String mobileNumber;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="customer")
    private User customer;

    @OneToMany(mappedBy="address")
    private List<Order> orders;

    public Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Address(int addressId, String name, String line1, String line2, String city, String landmark, String mobileNumber, User customer, List<Order> orders) {
        this.addressId = addressId;
        this.name = name;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.landmark = landmark;
        this.mobileNumber = mobileNumber;
        this.customer = customer;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", name='" + name + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", landmark='" + landmark + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", customer=" + customer +
                ", orders=" + orders +
                '}';
    }
}
