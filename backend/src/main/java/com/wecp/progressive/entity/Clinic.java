package com.wecp.progressive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int clinicId;
private String clinicName;
private String location;
private int doctorId;
private String contactNumber;
private int establishedYear;
public Clinic() {
}

public Clinic(int clinicId, String clinicName, String location, int doctorId, String contactNumber,
        int establishedYear) {
    this.clinicId = clinicId;
    this.clinicName = clinicName;
    this.location = location;
    this.doctorId = doctorId;
    this.contactNumber = contactNumber;
    this.establishedYear = establishedYear;
}

public Integer getClinicId() {
    return clinicId;
}
public void setClinicId(Integer clinicId) {
    this.clinicId = clinicId;
}
public int getDoctorId() {
    return doctorId;
}
public void setDoctorId(int doctorId) {
    this.doctorId = doctorId;
}
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
public String getClinicName() {
    return clinicName;
}
public void setClinicName(String clinicName) {
    this.clinicName = clinicName;
}
public String getContactNumber() {
    return contactNumber;
}
public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
}
public int getEstablishedYear() {
    return establishedYear;
}
public void setEstablishedYear(int establishedYear) {
    this.establishedYear = establishedYear;
}


}