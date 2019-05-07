package pl.hospital.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.hospital.dto.DoctorDto;
import pl.hospital.enums.SpecialityEnum;
import pl.hospital.service.DoctorService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping(value = "/speciality/{speciality}")
    public List<DoctorDto> getDoctorsBySpeciality(@PathVariable SpecialityEnum speciality) {
        log.info("Fetching doctors by speciality {}", speciality);
        return doctorService.getDoctorsBySpeciality(speciality);
    }
}
