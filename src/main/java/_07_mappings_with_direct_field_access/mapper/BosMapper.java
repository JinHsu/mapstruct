package _07_mappings_with_direct_field_access.mapper;

import _07_mappings_with_direct_field_access.model.dto.BosDto;
import _07_mappings_with_direct_field_access.model.pojo.Bos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BosMapper {

    @Mapping(target = "bosName", source = "name")
    BosDto toBosDto(Bos bos);

    @InheritInverseConfiguration(name = "toBosDto")
    Bos toBos(BosDto bosDto);
}
