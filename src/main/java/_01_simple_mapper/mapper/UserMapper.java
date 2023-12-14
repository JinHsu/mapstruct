package _01_simple_mapper.mapper;

import _01_simple_mapper.model.dto.UserDto;
import _01_simple_mapper.model.pojo.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "fullName", source = "name")
    UserDto buildUserDto(User user);
}
