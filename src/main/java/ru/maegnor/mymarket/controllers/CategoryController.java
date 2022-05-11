package ru.maegnor.mymarket.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maegnor.mymarket.dto.CategoryDto;
import ru.maegnor.mymarket.service.CategoryService;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findall() {
        return categoryService.findall();
    }

}
