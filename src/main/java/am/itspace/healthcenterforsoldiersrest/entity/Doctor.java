package com.example.healthcenterforsolidiers.entity;

import com.example.healthcenterforsolidiers.constants.Gender;
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
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date birthDate;
    @ManyToOne
    private Specialization specialization;

}
