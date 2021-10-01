package ru.gb.pugacheva.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.pugacheva.dtos.ProductDto;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDto> findAll(){
        List <ProductDto> result = new ArrayList<>();
        List <Product> products = productService.findAll();
        for (int i = 0; i < products.size(); i++) {
            result.add(new ProductDto(products.get(i).getId(),products.get(i).getTitle(),products.get(i).getPrice()));
        }
        return result;
    }


    @GetMapping("/product/{id}")
    public ProductDto findById (@PathVariable Long id){
        Product product = productService.findByID(id).get();
        return new ProductDto(product.getId(),product.getTitle(), product.getPrice());
    }

}
