package ru.maegnor.mymarket.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.maegnor.mymarket.dao.CategoryDao;
import ru.maegnor.mymarket.dto.CategoryDto;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryDao categoryDao;

    public List<CategoryDto> findall (){
        return categoryDao.findAll().stream().map(item -> new CategoryDto(item)).collect(Collectors.toList());
    }
}
