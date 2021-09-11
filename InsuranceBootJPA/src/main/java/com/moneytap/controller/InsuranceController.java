package com.moneytap.controller;

import com.moneytap.model.Insurance;
import com.moneytap.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan(basePackages = "com.moneytap.service")
@RequestMapping(value = "/insurance")
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Insurance> getInsurances(){
      return   insuranceService.getInsurances();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/insurance")
    public void  addInsurance(@RequestBody Insurance insurance){
        insuranceService.addInsurance(insurance);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Insurance getInsurancesById(@PathVariable("id") int id){
        return   insuranceService.getInsuranceById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateInsurance(  @RequestBody Insurance insurance, @PathVariable("id") int id){
        insuranceService.updateInsurance(insurance,id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{insuranceId}")
    public void deleteEmployee(@PathVariable("insuranceId") Insurance insuranceId){
        insuranceService.deleteInsurance(insuranceId);
    }
}
