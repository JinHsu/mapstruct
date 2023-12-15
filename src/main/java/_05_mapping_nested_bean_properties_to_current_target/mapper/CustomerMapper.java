package _05_mapping_nested_bean_properties_to_current_target.mapper;

import _05_mapping_nested_bean_properties_to_current_target.model.dto.CustomerDto;
import _05_mapping_nested_bean_properties_to_current_target.model.pojo.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMapper {

    // 将customerDto的record所有属性自动映射到Customer的所有属性
    @Mapping(target = ".", source = "record")
    // 将customerDto的account所有属性自动映射到Customer的所有属性
    @Mapping(target = ".", source = "account")
    // 解决name属性冲突问题
    @Mapping(target = "name", source = "record.name")
    Customer customerDtoToCustom(CustomerDto customerDto);
}
