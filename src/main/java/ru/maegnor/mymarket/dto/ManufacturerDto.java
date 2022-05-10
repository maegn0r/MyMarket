package ru.maegnor.mymarket.dto;

import lombok.*;
import ru.maegnor.mymarket.entity.Manufacturer;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerDto {


    private Long id;
    private String name;

    public ManufacturerDto (Manufacturer manufacturer){
        this.id = manufacturer.getId();
        this.name = manufacturer.getName();
    }

}
