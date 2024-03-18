package com.turkcell.rentacar.entities.concretes;

import com.turkcell.rentacar.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
@Table(name = "brands")
public class Brand extends BaseEntity {

    @Column(name = "name")
    private String name;

}
