package _12_mappers_using_di.mapper;

import _12_mappers_using_di.model.dto.MouseDto;
import _12_mappers_using_di.model.pojo.Mouse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.FIELD)
public interface MouseMapper {

    MouseDto toMouseDto(Mouse mouse);
}
