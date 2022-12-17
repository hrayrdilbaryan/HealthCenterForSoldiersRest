package com.example.healthcenterforsolidiers.entity;

import com.example.healthcenterforsolidiers.constants.InjuryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "history")

public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(value = EnumType.STRING)
    private InjuryType injuryType;
    private String description;
    @ManyToOne
    private Aniceta aniceta;

}
