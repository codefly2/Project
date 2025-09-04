package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.dao.ClinicDAO;
import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.service.ClinicService;

public class ClinicServiceImplJdbc  implements ClinicService{
        private ClinicDAO clinicDAO;
        
    public ClinicServiceImplJdbc(ClinicDAO clinicDAO) {
            this.clinicDAO = clinicDAO;
        }

    @Override
    public List<Clinic> getAllClinics() throws Exception {
        try {
            return clinicDAO.getAllClinics();
        } catch (SQLException e) {
            throw new Exception("Error fetching all doctors", e);
        }
    }

    @Override
    public Clinic getClinicById(int clinicId) throws Exception {
        try {
            return clinicDAO.getClinicById(clinicId);
        } catch (Exception e) {
            throw new Exception("Error fetching doctor with ID " + clinicId, e);
        }
    }

    @Override
    public Integer addClinic(Clinic clinic) throws Exception {
               try {
            return clinicDAO.addClinic(clinic);
        } catch (SQLException e) {
            throw new Exception("Error adding doctor: " + clinic.getClinicName(), e);
        }

    }

    @Override
    public void updateClinic(Clinic clinic) throws Exception {
        try {
clinicDAO.updateClinic(clinic);
        } catch (SQLException e) {
            throw new Exception("Error updating doctor with ID " + clinic.getDoctorId(), e);
        }
    }

    @Override
    public void deleteClinic(int clinicId) throws Exception {
        try {
            clinicDAO.deleteClinic(clinicId);
        } catch (SQLException e) {
            throw new Exception("Error deleting doctor with ID " + clinicId, e);
        }
    }

    @Override
    public List<Clinic> getAllClinicByLocation(String location) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllClinicByLocation'");
    }

    @Override
    public List<Clinic> getAllClinicByDoctorId(int doctorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllClinicByDoctorId'");
    }

}