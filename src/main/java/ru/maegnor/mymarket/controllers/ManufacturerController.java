package ru.maegnor.mymarket.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maegnor.mymarket.dto.ManufacturerDto;
import ru.maegnor.mymarket.service.ManufacturerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manufacturer")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @GetMapping
    public List<ManufacturerDto> findAll (){
        return manufacturerService.findAll();
    };

}
