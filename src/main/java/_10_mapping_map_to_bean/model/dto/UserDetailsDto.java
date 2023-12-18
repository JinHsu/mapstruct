package _10_mapping_map_to_bean.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserDetailsDto {

    private String userName;

    private String nickName;

    private String address;

    private BigDecimal height;

    private Double weight;

    private Integer age;
}
