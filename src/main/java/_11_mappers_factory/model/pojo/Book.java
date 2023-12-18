package _11_mappers_factory.model.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {

    private BigDecimal power;

    private Integer pages;

    public Book() {
    }

    public Book(BigDecimal power, Integer pages) {
        this.power = power;
        this.pages = pages;
    }
}
