package _02_mapping_composition.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RoleEntity extends BaseEntity {

    private String roleName;
}
