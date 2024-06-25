package com.eliehome.officeInformation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
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

    @Length(max=50, min = 5, message = "Address must be at least of 5 - 50 characters " )
    private String address;

    @Length(max=50, min = 2, message = "City must be at least of 2 - 50 characters ")
    private String city;

    @Length(max=50, min = 2, message = "State must be at least of 2 - 50 characters ")
    private String state;
    @NotBlank(message = "Add manager Name")
    @Length(max = 50, min = 2, message = "Manager Name must be at least of 2 - 50 characters ")
    private String manager;


}
