package _09_using_constructors.mapper;

import _09_using_constructors.model.dto.OrgDto;
import _09_using_constructors.model.dto.OrgDto2;
import _09_using_constructors.model.dto.OrgDto3;
import _09_using_constructors.model.dto.OrgDto4;
import _09_using_constructors.model.pojo.Org;
import org.mapstruct.Mapper;

@Mapper
public interface OrgMapper {

    // 有@Default注解的构造方法，忽略其他构造方法
    OrgDto toOrgDto(Org org);

    // 有且仅有一个public构造方式时，忽略其他非public构造方法
    OrgDto2 toOrgDto2(Org org);

    // 当有一个public的无参构造方式时，忽略其他构造方法
    OrgDto3 toOrgDto3(Org org);

    // 当有多个不确定的构造方法时，编译时将跑出异常。为了确定一个构造方法，可以使用@Default注解其中的一个。
    OrgDto4 toOrgDto4(Org org);
}
