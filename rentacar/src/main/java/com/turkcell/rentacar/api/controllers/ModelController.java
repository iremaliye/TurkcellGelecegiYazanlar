package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.entities.concretes.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-v1-models")
public class ModelController {

    private final ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Model> addModel(@RequestBody Model model) {
        Model addedModel = modelService.add(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedModel);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Model> updateModel(@PathVariable("id") int id, @RequestBody Model updatedModel) {
        Model updated = modelService.update(id, updatedModel);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteModel(@PathVariable("id") int id) {
        modelService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Model>> getAllModels() {
        List<Model> models = modelService.getAll();
        return ResponseEntity.ok(models);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Model> getModelById(@PathVariable("id") int id) {
        Model model = modelService.getById(id);
        return ResponseEntity.ok(model);
    }
}