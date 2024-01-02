package com.debuggeando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class CustomerEntity implements Serializable {
    @Id
    private String id;
    /*
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 12)
    private String dni;
     */

    @Column(length = 50)
    private String fullName;

    @Column(length = 20)
    private String creditCard;

    private Integer totalFlights;
    private Integer totalLoadgings;
    private Integer totalTours;
    @Column(name = "12")
    private String phoneNumber;



}
