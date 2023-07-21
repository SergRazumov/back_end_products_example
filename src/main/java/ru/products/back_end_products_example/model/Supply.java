package ru.products.back_end_products_example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Supplies")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Supply {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DATE", nullable = false)
    @Basic
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "PRODUCER")
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "PRODUCT")
    private Product product;

    @Column(name = "PRICE", length=100)
    private Double price;

    @Column(name = "WEIGHT", length=100)
    private Double weight;
}
