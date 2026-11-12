package hu.unideb.inf.springdatafx_cs10.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    long id;
    String name;
    LocalDate dateOfBirth;
}
