package _08_using_builders.mapper;

import _08_using_builders.model.dto.PersonDto;
import _08_using_builders.model.pojo.Person;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    Person toPerson(PersonDto personDto);
}
