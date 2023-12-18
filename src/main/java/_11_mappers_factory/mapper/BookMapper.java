package _11_mappers_factory.mapper;

import _11_mappers_factory.model.dto.BookDto;
import _11_mappers_factory.model.pojo.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;

@Mapper
public interface BookMapper {

    public static void main(String[] args) {
        System.out.println(INSTANCE.toBookDto(new Book(BigDecimal.valueOf(163.78), 600)));
    }

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto toBookDto(Book book);
}
