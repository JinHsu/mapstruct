package _05_mapping_nested_bean_properties_to_current_target.model.dto;

import _05_mapping_nested_bean_properties_to_current_target.model.pojo.Account;
import _05_mapping_nested_bean_properties_to_current_target.model.pojo.Record;
import lombok.Data;

@Data
public class CustomerDto {

    private Record record;

    private Account account;
}
