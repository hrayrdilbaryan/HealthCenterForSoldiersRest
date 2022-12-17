package com.example.healthcenterforsolidiers.entity;

import com.example.healthcenterforsolidiers.constants.BloodType;
import com.example.healthcenterforsolidiers.constants.Gender;
import com.example.healthcenterforsolidiers.constants.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date birthDate;
    @Enumerated(value = EnumType.STRING)
    private BloodType bloodType;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    private double height;
    private double weight;


}
