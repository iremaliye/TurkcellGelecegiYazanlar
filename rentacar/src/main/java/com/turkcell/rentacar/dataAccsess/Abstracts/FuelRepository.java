package com.turkcell.rentacar.dataAccsess.Abstracts;

import com.turkcell.rentacar.entities.concretes.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<Fuel,Integer> {
}
