package com.sliit.yasith.gifts.giftorderingsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Payment")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Payment extends AuditModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    @Column
    private String name;

    @Column
    private String paymentMethod;

    @Column
    private int creditCardNumber;

    @Column
    @NotNull
    private double paymentAmount;

    @Column
    private int cvcNumber;

    @Column
    private int pinNumber;

    @Column
    private int mobileNumber;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "payment")
    private Order order;

    public Payment() {
    }

    public Payment(String name, String paymentMethod, int creditCardNumber, @NotNull double paymentAmount, int cvcNumber, int pinNumber, int mobileNumber, Order order) {
        this.name = name;
        this.paymentMethod = paymentMethod;
        this.creditCardNumber = creditCardNumber;
        this.paymentAmount = paymentAmount;
        this.cvcNumber = cvcNumber;
        this.pinNumber = pinNumber;
        this.mobileNumber = mobileNumber;
        this.order = order;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getCvcNumber() {
        return cvcNumber;
    }

    public void setCvcNumber(int cvcNumber) {
        this.cvcNumber = cvcNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
