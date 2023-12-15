package _04_several_source_params_mapping.mapper;

import _04_several_source_params_mapping.model.dto.CarDto;
import _04_several_source_params_mapping.model.pojo.Engine;
import _04_several_source_params_mapping.model.pojo.Wheel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {

    @Mapping(target = "spec", source = "engine.spec")
    @Mapping(target = "wheelCount", source = "wheel.count")
    @Mapping(target = "description", source = "desc")
    CarDto toCarDto(Engine engine, Wheel wheel, String desc);
}
