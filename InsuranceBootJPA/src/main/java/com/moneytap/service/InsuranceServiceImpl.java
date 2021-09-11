package com.moneytap.service;

import com.moneytap.model.Insurance;
import com.moneytap.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    private InsuranceRepository insuranceRepository;

    @Override
    public void addInsurance(Insurance ins) {
        insuranceRepository.save(ins);
    }

    @Override
    public void updateInsurance(Insurance insurance, int id) {
            insuranceRepository.save(insurance);
    }

    @Override
    public void deleteInsurance(Insurance insurance) {
                insuranceRepository.delete(insurance);
    }

    @Override
    public Insurance getInsuranceById(int id) {
        Insurance ins=new Insurance();
        ins= insuranceRepository.findById(id).get();
        return  ins;
    }

    @Override
    public List<Insurance> getInsurances() {
       List<Insurance> ins=new ArrayList<>();
         insuranceRepository.findAll().forEach(ins::add);
        return  ins;
    }


}
