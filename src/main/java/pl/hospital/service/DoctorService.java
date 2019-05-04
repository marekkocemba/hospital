package pl.hospital.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hospital.dto.DoctorDto;
import pl.hospital.entity.Doctor;
import pl.hospital.enums.SpecificationEnum;
import pl.hospital.mapper.DoctorMapper;
import pl.hospital.repository.DoctorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    private final DoctorMapper doctorMapper;

    public DoctorService(DoctorRepository doctorRepository, DoctorMapper doctorMapper){
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
        Doctor doctor = new Doctor();
        doctor.setName("MK");
        doctor.setSurname("nazw");
        doctor.setSpecification(SpecificationEnum.NEUROLOGIST);
        doctorRepository.save(doctor);
        doctor.setId(2L);
        doctorRepository.save(doctor);
    }

    public List<DoctorDto> getDoctorsBySpecification(SpecificationEnum specification) {
        return doctorRepository.findBySpecification(specification).stream().map(doctorMapper::getDoctorDto).collect(Collectors.toList());
    }
}
