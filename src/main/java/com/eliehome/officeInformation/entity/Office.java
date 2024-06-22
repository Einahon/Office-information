package com.eliehome.officeInformation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long office_id;

    @Length(max=50, min = 0)
    private String address;

    @Length(max=50, min = 0)
    private String city;

    @Length(max=50, min = 0)
    private String state;


    private String manager;


}
