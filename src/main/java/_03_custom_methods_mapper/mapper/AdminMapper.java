package _03_custom_methods_mapper.mapper;

import _03_custom_methods_mapper.model.dto.AddressDto;
import _03_custom_methods_mapper.model.dto.AdminDto;
import _03_custom_methods_mapper.model.pojo.Address;
import _03_custom_methods_mapper.model.pojo.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AdminMapper {

    @Mapping(target = "fullName", source = "name")
    AdminDto toAdminDto(Admin admin);

    default AddressDto toAddress(Address address) {
        // hand write custom mapping logic
        return null;
    }
}
