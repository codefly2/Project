package com.wecp.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Billing;
@Repository
public interface BillingRepository extends JpaRepository<Billing,Integer> {
    
     List<Billing> findByPatient_PatientId(int patientId);
}
