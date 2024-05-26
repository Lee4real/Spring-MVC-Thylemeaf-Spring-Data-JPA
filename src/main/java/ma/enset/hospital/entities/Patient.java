package ma.enset.hospital.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// The @Entity annotation indicates that this class is a JPA entity.
// This means that a table in the database will be created for this entity.
@Entity

// The @Data annotation from Lombok generates getters, setters, equals, hashCode, and toString methods.
@Data

// The @NoArgsConstructor and @AllArgsConstructor annotations from Lombok generate constructors without and with parameters respectively.
@NoArgsConstructor
@AllArgsConstructor

// The @Builder annotation from Lombok provides a builder pattern for object creation.
@Builder
public class Patient {

    // The @Id and @GeneratedValue annotations are JPA annotations to indicate the primary key and the auto-increment strategy.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The @NotBlank, @Size, and @Pattern are validation constraints to ensure the 'nom' field is not blank, has a size between 4 and 20, and only contains letters and numbers.
    @NotBlank
    @Size(min = 4 , max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Le nom ne doit contenir que des lettres et des chiffres.")
    private String nom;

    // The @Temporal annotation is used with java.util.Date and java.util.Calendar classes. It converts the date and time values from Java Object to compatible database type and vice versa.
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    // A simple boolean field to indicate if the patient is malade (sick).
    private boolean malade;

    // The @Min annotation is a validation constraint to ensure the 'score' field is at least 100.
    @Min(100)
    private int score;
}