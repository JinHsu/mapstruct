package _09_using_constructors.model.dto;

import lombok.Data;

@Data
public class OrgDto2 {

    private Long id;

    private String OrgCode;

    private String OrgName;

    protected OrgDto2() {
    }

    private OrgDto2(Long id) {
        this.id = id;
    }

    protected OrgDto2(Long id, String orgCode, String orgName) {
        this.id = id;
        OrgCode = orgCode;
        OrgName = orgName;
    }

    public OrgDto2(String orgCode, String orgName) {
        OrgCode = orgCode;
        OrgName = orgName;
    }
}
