package _02_mapping_composition.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {

    private Long id;

    private String createdBy;

    private LocalDateTime creationTime;

    private String fullName;
}
