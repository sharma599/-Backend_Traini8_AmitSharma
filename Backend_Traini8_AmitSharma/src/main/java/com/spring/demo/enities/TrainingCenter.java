package com.spring.demo.enities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String centerName;

    @Column(length = 12, nullable = false, unique = true)
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> coursesOffered;

    private Long createdOn = System.currentTimeMillis();


    @Email
    private String contactEmail;

    @Column(nullable = false)
    @Pattern(regexp = "[0-9]{10}")
    private String contactPhone;
//
    public void setCreatedOn(long l) {
   }

}

