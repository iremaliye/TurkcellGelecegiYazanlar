package com.turkcell.rentacar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.entities.concretes.Fuel;

@RestController
@RequestMapping("api-v1-fuels")
public class FuelController {

    private final FuelService fuelService;

    @Autowired
    public FuelController(FuelService fuelService) {
        this.fuelService = fuelService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Fuel> addFuel(@RequestBody Fuel fuel) {

        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fuel> updateFuel(@PathVariable("id") int id, @RequestBody Fuel updatedFuel) {
        Fuel updated = fuelService.update(id, updatedFuel);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteFuel(@PathVariable("id") int id) {
        fuelService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fuel>> getAllFuels() {
        List<Fuel> fuels = fuelService.getAll();
        return ResponseEntity.ok(fuels);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Fuel> getFuelById(@PathVariable("id") int id) {
        Fuel fuel = fuelService.getById(id);
        return ResponseEntity.ok(fuel);
    }
}
