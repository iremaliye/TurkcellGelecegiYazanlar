package com.turkcell.rentacar.business.concretes;

import java.util.List;
import java.util.Optional;

import com.turkcell.rentacar.dataAccsess.Abstracts.TransmissionRepository;
import org.springframework.stereotype.Service;

import com.turkcell.rentacar.business.abstracts.TransmissionService;

import com.turkcell.rentacar.entities.concretes.Transmission;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class TransmissionManager implements TransmissionService{


    @Override
    public Transmission add(Transmission transmission) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Transmission> getAll() {
        return null;
    }

    @Override
    public Transmission getById(int id) {
        return null;
    }

    @Override
    public Transmission update(int id, Transmission updatedTransmission) {
        return null;
    }
}
