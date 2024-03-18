package com.turkcell.rentacar.dataAccsess.Abstracts;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransmissionRepository extends JpaRepository<TransmissionService,Integer> {
}
