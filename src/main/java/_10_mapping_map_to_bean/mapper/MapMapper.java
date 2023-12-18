package _10_mapping_map_to_bean.mapper;

import _10_mapping_map_to_bean.model.dto.UserDetailsDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.Map;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapMapper {

    @Mapping(target = "userName", source = "name")
    UserDetailsDto toUserDetailsDto(Map<String, String> props);
}
