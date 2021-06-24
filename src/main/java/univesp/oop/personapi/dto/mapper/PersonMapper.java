package univesp.oop.personapi.dto.mapper;

import org.springframework.web.bind.annotation.Mapping;
import univesp.oop.personapi.dto.request.PersonDTO;
import univesp.oop.personapi.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}