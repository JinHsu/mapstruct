package _02_mapping_composition.mapper;

import _02_mapping_composition.annotation.ToEntity;
import _02_mapping_composition.model.dto.RoleDto;
import _02_mapping_composition.model.dto.UserDto;
import _02_mapping_composition.model.entity.RoleEntity;
import _02_mapping_composition.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ExampleMapper {

    @ToEntity
    @Mapping(target = "fullName", source = "userName")
    UserDto toUserDto(UserEntity userEntity);

    @ToEntity
    RoleDto toRoleDto(RoleEntity roleEntity);
}
