package _09_using_constructors.model.dto;

import _09_using_constructors.annotation.Default;
import lombok.Data;

@Data
public class OrgDto4 {

    private Long id;

    private String OrgCode;

    private String OrgName;

//    public OrgDto4() {
//    }

//    public OrgDto4(Long id) {
//        this.id = id;
//    }

    @Default
    public OrgDto4(Long id, String orgCode, String orgName) {
        this.id = id;
        OrgCode = orgCode;
        OrgName = orgName;
    }

    public OrgDto4(String orgCode, String orgName) {
        OrgCode = orgCode;
        OrgName = orgName;
    }
}
