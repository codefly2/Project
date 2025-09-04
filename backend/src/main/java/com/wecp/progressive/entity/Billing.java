package com.wecp.progressive.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Billing {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int billingId;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name="patient_Id",nullable = false)
private Patient patient;

@Column(nullable = false)
double amount;

@Column(nullable = false)
private Date dateOfIssue;

Date dueDate;
String status;

public Billing() {
}
public Date getDateOfIssue() {
    return dateOfIssue;
}
public void setDateOfIssue(Date dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
}
public Date getDueDate() {
    return dueDate;
}
public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
}
public int getBillingId() {
    return billingId;
}
public void setBillingId(int billingId) {
    this.billingId = billingId;
}
public Patient getPatient() {
    return patient;
}
public void setPatient(Patient patient) {
    this.patient = patient;
}
public Double getAmount() {
    return amount;
}
public void setAmount(Double amount) {
    this.amount = amount;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
} 

}