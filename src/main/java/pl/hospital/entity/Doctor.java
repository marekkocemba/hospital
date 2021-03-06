package pl.hospital.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.hospital.enums.SpecialityEnum;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Doctor extends User {

    @Enumerated(EnumType.STRING)
    private SpecialityEnum speciality;

}
