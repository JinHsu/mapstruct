package _09_using_constructors.model.dto;

import _09_using_constructors.annotation.Default;
import lombok.Data;

@Data
public class OrgDto {

    private Long id;

    private String OrgCode;

    private String OrgName;

    @Default
    public OrgDto(Long id, String orgCode, String orgName) {
        this.id = id;
        OrgCode = orgCode;
        OrgName = orgName;
    }

    public OrgDto(String orgCode, String orgName) {
        OrgCode = orgCode;
        OrgName = orgName;
    }
}
