package com.turkcell.rentacar.business.abstracts;
import java.util.List;

import com.turkcell.rentacar.entities.concretes.Model;
public interface ModelService {
    Model add(Model model);
    void delete(int id);
    List<Model> getAll();
    Model getById(int id);
    Model update(int id, Model updatedModel);
}
