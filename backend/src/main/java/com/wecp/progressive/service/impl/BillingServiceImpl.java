package com.wecp.progressive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Billing;
import com.wecp.progressive.repository.BillingRepository;
import com.wecp.progressive.service.BillingService;
@Service
public class BillingServiceImpl  implements BillingService{
    @Autowired
    BillingRepository br;
    @Override
    public List<Billing> getAllBills() {
     return  br.findAll();
    }

    @Override
    public Billing getBillById(int billingId) {
      return br.findById(billingId).orElseThrow();
    }

    @Override
    public Integer createBill(Billing billing) {
        return br.save(billing).getBillingId();
    }

    @Override
    public void deleteBill(int billingId) {
      br.deleteById(billingId);
    }

    @Override
    public List<Billing> getBillsByPatientId(int patientId) {
    //    return br.getBillsByPatientId(patientId);
    return br.findAll();
    }

}