package pl.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hospital.entity.Doctor;
import pl.hospital.enums.SpecialityEnum;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findBySpeciality(SpecialityEnum speciality);
}
