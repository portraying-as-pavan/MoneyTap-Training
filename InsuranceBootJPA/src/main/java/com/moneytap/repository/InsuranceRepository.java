package com.moneytap.repository;

import com.moneytap.model.Insurance;
import org.springframework.data.repository.CrudRepository;

public interface InsuranceRepository extends CrudRepository<Insurance,Integer> {

   // Insurance getByName(String Name);

    Insurance getInsuranceByInsName(String name);
}
