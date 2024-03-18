package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.entities.concretes.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-v1-brands")
public class BrandsController {

    private final BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Brand> addBrand(@RequestBody Brand brand) {
        Brand addedBrand = brandService.add(brand);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedBrand);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Brand> updateBrand(@PathVariable("id") int id, @RequestBody Brand updatedBrand) {
        Brand updated = brandService.update(id, updatedBrand);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteBrand(@PathVariable("id") int id) {
        brandService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Brand>> getAllBrands() {
        List<Brand> brands = brandService.getAll();
        return ResponseEntity.ok(brands);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Brand> getBrandById(@PathVariable("id") int id) {
        Brand brand = brandService.getById(id);
        return ResponseEntity.ok(brand);
    }
}