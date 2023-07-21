package ru.products.back_end_products_example.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.products.back_end_products_example.model.Supply;
import ru.products.back_end_products_example.model.SupplyResponse;

import java.time.LocalDate;
import java.util.List;

public interface SupplyRepository extends JpaRepository<Supply, Integer> {
    @Query(value = "select product as product, producer as producer, sum(weight) as weight, sum(price) as price from Supplies " +
            "where date between :firstDate and :lastDate" +
            " group by product, producer;",
            nativeQuery = true)

    List<SupplyResponse> getSupplies(LocalDate firstDate, LocalDate lastDate);


}
