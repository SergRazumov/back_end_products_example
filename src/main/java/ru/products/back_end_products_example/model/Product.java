package ru.products.back_end_products_example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Products")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Product {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TYPE", length=100)
    private String type;

    @Column(name = "SORT", unique=true, length=100)
    private String sort;
}
