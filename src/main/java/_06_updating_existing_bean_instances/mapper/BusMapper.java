package _06_updating_existing_bean_instances.mapper;

import _06_updating_existing_bean_instances.model.dto.BusDto;
import _06_updating_existing_bean_instances.model.pojo.Bus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BusMapper {

    void toBusDto(Bus bus, @MappingTarget BusDto busDto);

    BusDto toBusDto2(Bus bus, @MappingTarget BusDto busDto);

}
