package ru.products.back_end_products_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.products.back_end_products_example.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
