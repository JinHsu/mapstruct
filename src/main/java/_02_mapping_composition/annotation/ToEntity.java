package _02_mapping_composition.annotation;

import org.mapstruct.Mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mapping(target = "id", source = "id")
@Mapping(target = "creationTime", expression = "java(java.time.LocalDateTime.now())")
@Mapping(target = "createdBy", constant = "张三")
public @interface ToEntity {

}
