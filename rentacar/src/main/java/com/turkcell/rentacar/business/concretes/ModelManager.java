package com.turkcell.rentacar.business.concretes;

import java.util.List;
import java.util.Optional;

import com.turkcell.rentacar.dataAccsess.Abstracts.ModelRepository;
import org.springframework.stereotype.Service;

import com.turkcell.rentacar.business.abstracts.ModelService;

import com.turkcell.rentacar.entities.concretes.Model;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class ModelManager implements ModelService{


    @Override
    public Model add(Model model) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Model> getAll() {
        return null;
    }

    @Override
    public Model getById(int id) {
        return null;
    }

    @Override
    public Model update(int id, Model updatedModel) {
        return null;
    }
}
