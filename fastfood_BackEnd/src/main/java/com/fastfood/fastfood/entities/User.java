package com.fastfood.fastfood.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ELEF_USER")
public class User {

    @Id
    @Column(name="USERID")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    //    @Id
    @Length(max=30)
    @Column(name="EMAILID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String emailId;

    @NotEmpty(message="customer name should not be empty")
    @Length(max=30)
    @Column(name="NAME")
    private String customerName;


    @NotEmpty(message="password cannot be empty")
    @Length(min=3)
    @Column(name="PASSWORD")
    private String password;

    @NotEmpty(message="security question cannot be empty")
    @Length(max=80)
    private String security_question;

    @NotEmpty(message="security question cannot be empty")
    @Length(max=30)
    private String security_answer;

    @NotEmpty(message="mobile number should not be empty")
    @Column(name="MOBILENUMBER")
    private String mobileNumber;

    @NotEmpty(message="role should not be empty")
    @Pattern(regexp="Admin|Customer")
    private String role;

    @OneToMany(mappedBy="customer")
    private List<Address> address=new ArrayList<>();

    @OneToOne
    private CarryBox carryBox;


    @OneToMany(mappedBy="customer")
    private List<Order> myOrders;

    @OneToOne(mappedBy="admin")
    @JoinColumn(name="BRANCH")
    private Branch branch;

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



    public User(int userId, String emailId,
                @NotEmpty(message = "customer name should not be empty") @Length(max = 30) String customerName,
                @NotEmpty(message = "password cannot be empty") @Length(max = 40) String password,
                @NotEmpty(message = "security question cannot be empty") @Length(max = 30) String security_question,
                @NotEmpty(message = "security question cannot be empty") @Length(max = 30) String security_answer,
                @NotEmpty(message = "mobile number should not be empty") @Length(max = 30) String mobileNumber,
                @NotEmpty(message = "role should not be empty") @Pattern(regexp = "Admin|Customer") String role,
                List<Address> address, CarryBox carryBox, List<Order> myOrders, Branch branch) {
        super();
        this.userId = userId;
        this.emailId = emailId;
        this.customerName = customerName;
        this.password = password;
        this.security_question = security_question;
        this.security_answer = security_answer;
        this.mobileNumber = mobileNumber;
        this.role = role;
        this.address = address;
        this.carryBox = carryBox;
        this.myOrders = myOrders;
        this.branch = branch;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurity_question() {
        return security_question;
    }

    public void setSecurity_question(String security_question) {
        this.security_question = security_question;
    }

    public String getSecurity_answer() {
        return security_answer;
    }

    public void setSecurity_answer(String security_answer) {
        this.security_answer = security_answer;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @JsonIgnore
    public CarryBox getCarryBox() {
        return carryBox;
    }

    public void setCarryBox(CarryBox carryBox) {
        this.carryBox = carryBox;
    }

    public List<Order> getMyOrders() {
        return myOrders;
    }


    public void setMyOrders(List<Order> myOrders) {
        this.myOrders = myOrders;
    }

    @JsonIgnore
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }


    public void addAddress(Address address) {
        address.setCustomer(this);
        this.getAddress().add(address);
    }

    public void removeAddress(Address address) {
        address.setCustomer(null);
        this.getAddress().remove(address);
    }

    public void addOrder(Order order) {
        order.setCustomer(this);
        this.getMyOrders().add(order);
    }

    public void removeOrder(Order order) {
        order.setCustomer(null);
        this.getMyOrders().remove(order);
    }

    @Override
    public String toString() {
        return "User{" +
                "emailId='" + emailId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", password='" + password + '\'' +
                ", security_question='" + security_question + '\'' +
                ", security_answer='" + security_answer + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", role='" + role + '\'' +
                ", address=" + address +
                ", carryBox=" + carryBox +
                ", myOrders=" + myOrders +
                ", branch=" + branch +
                '}';
    }
}

