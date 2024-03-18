package com.turkcell.rentacar.core;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data // getter setter getirir.
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="createdDate")
    private LocalDateTime createdDate;
    @Column(name ="updatedDate")
    private LocalDateTime updatedDate;
    @Column(name ="deletedDate")
    private LocalDateTime deletedDate;


}
