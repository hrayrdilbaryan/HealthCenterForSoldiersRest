package com.example.healthcenterforsolidiers.entity;

import com.example.healthcenterforsolidiers.constants.Country;
import com.example.healthcenterforsolidiers.constants.Region;
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
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private Country country;
    @Enumerated(EnumType.STRING)
    private Region region;
    private String city;
    private String street;
    private String houseMember;
    @ManyToOne
    private User user;

}
