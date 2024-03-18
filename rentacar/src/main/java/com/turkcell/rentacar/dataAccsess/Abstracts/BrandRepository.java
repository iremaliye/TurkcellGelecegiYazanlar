package com.turkcell.rentacar.dataAccsess.Abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
