package com.example.studentregistry;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(value = "student")
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address adress;
    private List<String> favouriteSubject;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;

    public Student(String firstName,
                   String lastName,
                   String email,
                   Gender gender,
                   Address adress,
                   List<String> favouriteSubject,
                   BigDecimal totalSpentInBooks,
                   LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.adress = adress;
        this.favouriteSubject = favouriteSubject;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}