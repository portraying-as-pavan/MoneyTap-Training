package com.moneytap.service;

import com.moneytap.model.Insurance;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface InsuranceService {

    void addInsurance(Insurance ins);
    void updateInsurance(Insurance insurance, int id);
    void deleteInsurance(Insurance insurance);

    Insurance getInsuranceById(int id);
    List<Insurance> getInsurances();
 //   List<Insurance> getInsurancesByName(String name);

}
