package ru.maegnor.mymarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maegnor.mymarket.entity.Manufacturer;

public interface ManufacturerDao extends JpaRepository<Manufacturer, Long> {
}
