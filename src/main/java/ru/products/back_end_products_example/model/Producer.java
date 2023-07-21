package ru.products.back_end_products_example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Producers")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Producer {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", unique=true, length=100)
    private String name;
}
