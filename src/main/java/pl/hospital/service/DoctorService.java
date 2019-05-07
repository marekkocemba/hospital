package pl.hospital.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hospital.dto.DoctorDto;
import pl.hospital.enums.SpecialityEnum;
import pl.hospital.mapper.DoctorMapper;
import pl.hospital.repository.DoctorRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    private final DoctorMapper doctorMapper;

    public List<DoctorDto> getDoctorsBySpeciality(SpecialityEnum speciality) {
        return doctorRepository.findBySpeciality(speciality)
                .stream()
                .map(doctorMapper::toDoctorDto)
                .collect(Collectors.toList());
    }
}
