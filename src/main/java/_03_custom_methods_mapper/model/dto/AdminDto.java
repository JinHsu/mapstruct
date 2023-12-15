package _03_custom_methods_mapper.model.dto;

import lombok.Data;

@Data
public class AdminDto {

    private String fullName;

    private AddressDto address;
}
