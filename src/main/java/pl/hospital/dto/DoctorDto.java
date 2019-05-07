package pl.hospital.dto;

import lombok.Data;
import pl.hospital.enums.SpecialityEnum;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class DoctorDto {

    private Long id;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min=5)
    private String password;

    @NotNull
    @Size(min=3)
    private String name;

    @NotNull
    @Size(min=3)
    private String surname;

    @NotNull
    private SpecialityEnum speciality;
}
