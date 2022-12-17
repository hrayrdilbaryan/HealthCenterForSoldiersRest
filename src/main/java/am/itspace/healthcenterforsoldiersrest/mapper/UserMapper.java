package am.itspace.healthcenterforsoldiersrest.mapper;

import am.itspace.healthcenterforsoldiersrest.dto.CreateDoctorDto;
import am.itspace.healthcenterforsoldiersrest.dto.DoctorPutRequestDto;import am.itspace.healthcenterforsoldiersrest.dto.DoctorResponseDto;
import am.itspace.healthcenterforsoldiersrest.entity.Doctor;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    Doctor map(CreateDoctorDto createDoctorDto);

    CreateDoctorDto map(Doctor doctor);

    List<DoctorResponseDto> map(List<Doctor> DoctorList);

    CreateDoctorDto map(Optional<Doctor> category);

    Doctor map(DoctorPutRequestDto doctorPutRequestDto);

    Doctor map(Integer value);


}
