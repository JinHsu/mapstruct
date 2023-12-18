package _09_using_constructors.model.dto;

import lombok.Data;

@Data
public class OrgDto3 {

    private Long id;

    private String OrgCode;

    private String OrgName;

    public OrgDto3() {

    }

    public OrgDto3(Long id) {
        this.id = id;
    }

    public OrgDto3(Long id, String orgCode, String orgName) {
        this.id = id;
        OrgCode = orgCode;
        OrgName = orgName;
    }

    public OrgDto3(String orgCode, String orgName) {
        OrgCode = orgCode;
        OrgName = orgName;
    }
}
