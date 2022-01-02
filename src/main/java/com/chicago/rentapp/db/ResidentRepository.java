package com.chicago.rentapp.db;

import com.chicago.rentapp.entity.Resident;
import org.springframework.data.repository.CrudRepository;

public interface ResidentRepository  extends CrudRepository<Resident, Integer> {
}
