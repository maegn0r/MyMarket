package ru.maegnor.mymarket.dto;
import lombok.*;
import ru.maegnor.mymarket.entity.Category;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryDto {

    private Long id;
    private String name;

    public CategoryDto (Category category){

        this.id = category.getId();
        this.name= category.getName();

    }

}
