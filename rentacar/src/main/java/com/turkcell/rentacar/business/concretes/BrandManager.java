package com.turkcell.rentacar.business.concretes;

import java.util.List;
import java.util.Optional;

import com.turkcell.rentacar.dataAccsess.Abstracts.BrandRepository;
import org.springframework.stereotype.Service;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.entities.concretes.Brand;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class BrandManager implements BrandService{

    private BrandRepository brandRepository;
    @Override
    public Brand add(Brand brand) {
        Brand createdBrand = brandRepository.save(brand);
        return createdBrand;
    }

    @Override
    public Brand update(int id, Brand updateBrand) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Brand> getAll() {
        return null;
    }

    @Override
    public Brand getById(int id) {
        return null;
    }

}