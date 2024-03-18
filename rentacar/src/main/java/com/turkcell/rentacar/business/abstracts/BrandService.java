package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    Brand add (Brand brand);
    Brand update (int id, Brand updateBrand);
    void delete (int id);
    List<Brand> getAll();
    Brand getById(int id);
}
