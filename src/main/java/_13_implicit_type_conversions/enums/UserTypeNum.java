package _13_implicit_type_conversions.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserTypeNum {

    ADMIN("admin"),
    ROOT("root"),
    USER("user"),
    ;
    private final String value;
}
