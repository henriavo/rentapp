package com.chicago.rentapp.db;

import com.chicago.rentapp.entity.Landlord;
import org.springframework.data.repository.CrudRepository;

public interface LandlordRepository extends CrudRepository<Landlord, Integer> {
}
