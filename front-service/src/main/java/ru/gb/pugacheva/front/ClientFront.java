package ru.gb.pugacheva.front;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.gb.pugacheva.dtos.ProductDto;

import java.util.List;

@FeignClient("product-service")
public interface ClientFront {
    @GetMapping("/products")
    List<ProductDto> findAll();

    @GetMapping("/product/{id}")
    ProductDto findById(@PathVariable(value = "id") Long id);
}
