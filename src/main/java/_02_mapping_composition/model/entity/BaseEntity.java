package _02_mapping_composition.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 *
 */
@Data
public class BaseEntity {

    private Long id;

    private String createdBy;

    private LocalDateTime creationTime;
}
