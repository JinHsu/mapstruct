package _13_implicit_type_conversions.mapper;

import _13_implicit_type_conversions.model.dto.AccountDto;
import _13_implicit_type_conversions.model.pojo.Account;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AccountMapper {

    @Mapping(target = "total", numberFormat = "$#.00")
    @Mapping(target = "localDate", dateFormat = "yyyy-MM-dd")
    AccountDto toAccountDto(Account account);

    @InheritConfiguration(name = "toAccountDto")
    Account toAccount(AccountDto accountDto);
}
