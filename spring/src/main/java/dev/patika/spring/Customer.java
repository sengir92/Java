package dev.patika.spring;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id",length = 10, columnDefinition = "serial")
    private int id;

    @Column(name = "customer_name", length = 20, nullable = false)
    @NotNull
    private String name;

    @Column(name = "customer_mail", unique = true, nullable = false)
    @Email(message = "Please enter valid mail address")
    private String mail;

    @Temporal(TemporalType.DATE)
    @Column(name = "customer_on_date")
    private LocalDate onDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gender")
    private GENDER gender;


    public enum GENDER {
        MALE,
        FEMALE
    }

}
