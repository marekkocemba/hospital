package pl.hospital.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.hospital.dto.DoctorDto;
import pl.hospital.enums.SpecificationEnum;
import pl.hospital.service.DoctorService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping(value = "/specification/{specification}")
    public List<DoctorDto> getDoctorsBySpecification(@PathVariable SpecificationEnum specification) {
        log.info("Fetching doctors by specification {}", specification);
        return doctorService.getDoctorsBySpecification(specification);
    }
}
