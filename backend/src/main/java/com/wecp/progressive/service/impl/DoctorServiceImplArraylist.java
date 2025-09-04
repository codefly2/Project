package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Doctor;
import com.wecp.progressive.service.DoctorService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class DoctorServiceImplArraylist implements DoctorService {

    private static List<Doctor> doctorList = new ArrayList<>();

    @Override
    public void emptyArrayList() {
        doctorList = new ArrayList<>();
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorList;
    }

    @Override
    public Integer addDoctor(Doctor doctor) {
        doctorList.add(doctor);
        return doctorList.size();
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        List<Doctor> sortedDoctors = new ArrayList<>(doctorList);
        sortedDoctors.sort(Comparator.comparing(Doctor::getYearsOfExperience));
        return sortedDoctors;
    }

    @Override
    public void updateDoctor(Doctor doctor) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDoctor'");
    }

    @Override
    public void deleteDoctor(int doctorId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDoctor'");
    }

    @Override
    public Doctor getDoctorById(int doctorId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDoctorById'");
    }
}