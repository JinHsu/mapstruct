package _12_mappers_using_di.mapper;

import _12_mappers_using_di.model.dto.KeyBoardDto;
import _12_mappers_using_di.model.pojo.KeyBoard;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING, // 自身也必须是DI方式；如果是Factory方式，依赖也会通过Factory方式获取。
        uses = {MouseMapper.class}, // 引入需要注入的Mapper，必须
        // DI注入方式：属性/构造方法
        injectionStrategy = InjectionStrategy.FIELD
)
public interface KeyBoardMapper {

    @Mapping(target = "mouseDto", source = "mouse")
    KeyBoardDto toKeyBoardDto(KeyBoard keyBoard);

}
