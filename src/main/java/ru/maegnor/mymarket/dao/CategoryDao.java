package ru.maegnor.mymarket.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.maegnor.mymarket.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {
}
