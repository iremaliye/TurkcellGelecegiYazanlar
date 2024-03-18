package com.turkcell.rentacar.business.abstracts;
import java.util.List;

import com.turkcell.rentacar.entities.concretes.Transmission;

public interface TransmissionService {
    Transmission add(Transmission transmission);
    void delete(int id);
    List<Transmission> getAll();
    Transmission getById(int id);
    Transmission update(int id, Transmission updatedTransmission);
}
