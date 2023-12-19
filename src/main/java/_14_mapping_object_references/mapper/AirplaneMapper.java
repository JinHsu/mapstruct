package _14_mapping_object_references.mapper;

import _14_mapping_object_references.model.dto.AirplaneDto;
import _14_mapping_object_references.model.dto.PilotDto;
import _14_mapping_object_references.model.pojo.Airplane;
import _14_mapping_object_references.model.pojo.Pilot;
import org.mapstruct.Mapper;

/**
 * 5.2
 */
@Mapper
public interface AirplaneMapper {

    AirplaneDto toAirplaneDto(Airplane airplane);

    PilotDto toPilotDto(Pilot pilot);
}
