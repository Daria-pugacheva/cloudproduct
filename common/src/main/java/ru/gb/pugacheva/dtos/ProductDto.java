package ru.gb.pugacheva.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private int price;
    //private String categoryTitle;


    public ProductDto(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
