package com.example.healthcenterforsolidiers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "register_time")
public class RegisterTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private String date;
    private Integer active;
    @ManyToOne
    private User user;
    @ManyToOne
    private Doctor doctor;

}
