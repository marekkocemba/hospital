package pl.hospital.entity;

import lombok.Data;
import pl.hospital.enums.SpecificationEnum;

import javax.persistence.*;

@Data
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String name;

    private String surname;

    @Enumerated(EnumType.STRING)
    private SpecificationEnum specification;
}
