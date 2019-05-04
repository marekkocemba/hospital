package pl.hospital.dto;

import lombok.Data;
import pl.hospital.enums.SpecificationEnum;

@Data
public class DoctorDto {

    private String name;

    private String surname;

    private SpecificationEnum specification;
}
