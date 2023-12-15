package _08_using_builders.model.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {

    private String name;

    private int age;
}
