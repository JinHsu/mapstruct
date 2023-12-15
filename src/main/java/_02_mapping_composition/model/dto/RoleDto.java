package _02_mapping_composition.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoleDto {

    private Long id;

    private String createdBy;

    private LocalDateTime creationTime;

    private String roleName;
}
