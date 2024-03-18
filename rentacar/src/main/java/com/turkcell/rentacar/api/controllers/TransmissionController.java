package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import com.turkcell.rentacar.entities.concretes.Transmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-v1-transmissions")
public class TransmissionController {

    private final TransmissionService transmissionService;

    @Autowired
    public TransmissionController(TransmissionService transmissionService) {
        this.transmissionService = transmissionService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Transmission> addTransmission(@RequestBody Transmission transmission) {
        Transmission addedTransmission = transmissionService.add(transmission);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedTransmission);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Transmission> updateTransmission(@PathVariable("id") int id, @RequestBody Transmission updatedTransmission) {
        Transmission updated = transmissionService.update(id, updatedTransmission);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteTransmission(@PathVariable("id") int id) {
        transmissionService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Transmission>> getAllTransmissions() {
        List<Transmission> transmissions = transmissionService.getAll();
        return ResponseEntity.ok(transmissions);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Transmission> getTransmissionById(@PathVariable("id") int id) {
        Transmission transmission = transmissionService.getById(id);
        return ResponseEntity.ok(transmission);
    }
}