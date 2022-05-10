package ru.maegnor.mymarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.maegnor.mymarket.dao.ManufacturerDao;
import ru.maegnor.mymarket.dto.ManufacturerDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ManufacturerService {

    private final ManufacturerDao manufacturerDao;


    public List<ManufacturerDto> findAll (){
        return manufacturerDao.findAll().stream().map(item -> new ManufacturerDto(item)).collect(Collectors.toList());
    };

}
