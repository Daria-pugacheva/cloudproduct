package ru.gb.pugacheva.front;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.pugacheva.dtos.ProductDto;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FrontController {
    private final ClientFront clientFront;

    @RequestMapping("/findAll")
    public List<ProductDto> findAll() {
        return clientFront.findAll();
    }

    @RequestMapping("/findById/{id}")
    public ProductDto findById(@PathVariable(value = "id") Long id) {
        return clientFront.findById(id);
    }
}
