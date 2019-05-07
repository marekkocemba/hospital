package pl.hospital.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.hospital.dto.DoctorDto;
import pl.hospital.entity.Doctor;
import pl.hospital.service.DoctorRegistrationService;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class DoctorRegistrationController {

    private final DoctorRegistrationService doctorRegistrationService;

    @PostMapping("/doctor")
    public DoctorDto addDoctor(@RequestBody @Valid DoctorDto doctorDto) {
        log.info("Adding doctor: {} {}, speciality: {}", doctorDto.getName(), doctorDto.getSurname(), doctorDto.getSpeciality());
        return doctorRegistrationService.addDoctor(doctorDto);
    }
}
