package dev.patika.spring.dto;

import dev.patika.spring.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//Customer -> CustomerDto
public class CustomerResponse {
    private int id;
    private String name;
    private String mail;
    private Customer.GENDER gender;
}
