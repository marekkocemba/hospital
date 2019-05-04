package pl.hospital.mapper;

import org.springframework.stereotype.Component;
import pl.hospital.dto.DoctorDto;
import pl.hospital.entity.Doctor;

@Component
public class DoctorMapper {

    public DoctorDto getDoctorDto(Doctor doctor) {
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setName(doctor.getName());
        doctorDto.setSurname(doctor.getSurname());
        doctorDto.setSpecification(doctor.getSpecification());
        return doctorDto;
    }
}
