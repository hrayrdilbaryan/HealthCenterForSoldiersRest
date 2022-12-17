package com.example.healthcenterforsolidiers.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "aniceta")
public class Aniceta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreatedDate
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date endDate;
    @ManyToOne
    private User user;
    @ManyToOne
    private Doctor doctor;

}
