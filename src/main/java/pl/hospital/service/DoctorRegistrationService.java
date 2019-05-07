package pl.hospital.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hospital.dto.DoctorDto;
import pl.hospital.entity.Doctor;
import pl.hospital.exception.ClientException;
import pl.hospital.exception.ExceptionCodeEnum;
import pl.hospital.mapper.DoctorMapper;
import pl.hospital.repository.DoctorRepository;
import pl.hospital.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class DoctorRegistrationService {

    private final DoctorRepository doctorRepository;
    private final UserRepository userRepository;
    private final DoctorMapper mapper;

    public DoctorDto addDoctor(DoctorDto doctorDto) {
        Doctor doctor = mapper.toDoctor(doctorDto);
        userRepository.findByEmail(doctor.getEmail()).ifPresent(user -> {
            throw new ClientException("User with given email already exist", ExceptionCodeEnum.SAMPLE);
        });
        doctorRepository.save(doctor);
        return mapper.toDoctorDto(doctor);
    }
}
