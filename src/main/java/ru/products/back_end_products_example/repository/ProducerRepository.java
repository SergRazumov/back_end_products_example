package ru.products.back_end_products_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.products.back_end_products_example.model.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
}
