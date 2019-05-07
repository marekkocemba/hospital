package pl.hospital.mapper;

import org.springframework.stereotype.Component;
import pl.hospital.dto.DoctorDto;
import pl.hospital.entity.Doctor;

@Component
public class DoctorMapper {

    public DoctorDto toDoctorDto(Doctor doctor) {
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setId(doctor.getId());
        doctorDto.setName(doctor.getName());
        doctorDto.setSurname(doctor.getSurname());
        doctorDto.setSpeciality(doctor.getSpeciality());
        doctorDto.setEmail(doctor.getEmail());
        doctorDto.setPassword(doctor.getPassword());
        return doctorDto;
    }

    public Doctor toDoctor(DoctorDto doctorDto) {
        Doctor doctor = new Doctor();
        doctor.setName(doctorDto.getName());
        doctor.setSurname(doctorDto.getSurname());
        doctor.setSpeciality(doctorDto.getSpeciality());
        doctor.setEmail(doctorDto.getEmail());
        doctor.setPassword(doctorDto.getPassword());
        return doctor;
    }
}
