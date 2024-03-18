package com.turkcell.rentacar.entities.concretes;

import com.turkcell.rentacar.core.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="fuel")
public class Fuel extends BaseEntity {
    @Column(name="name")
    private String name;
}
