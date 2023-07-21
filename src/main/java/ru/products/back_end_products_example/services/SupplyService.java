package ru.products.back_end_products_example.services;

import org.springframework.stereotype.Service;
import ru.products.back_end_products_example.model.Producer;
import ru.products.back_end_products_example.model.Product;
import ru.products.back_end_products_example.model.Supply;
import ru.products.back_end_products_example.model.SupplyResponse;
import ru.products.back_end_products_example.repository.ProducerRepository;
import ru.products.back_end_products_example.repository.ProductRepository;
import ru.products.back_end_products_example.repository.SupplyRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class SupplyService {
    private final ProducerRepository producerRepository;
    private final ProductRepository productRepository;
    private final SupplyRepository supplyRepository;


    public SupplyService(ProducerRepository producerRepository, ProductRepository productRepository, SupplyRepository supplyRepository) {
        this.producerRepository = producerRepository;
        this.productRepository = productRepository;
        this.supplyRepository = supplyRepository;
    }

    public Producer addProducer(Producer producer) {
        return producerRepository.save(producer);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Supply addSupply(Supply supply) {
        return supplyRepository.save(supply);
    }

    //TODO вывод в виде json не получился
    public List<SupplyResponse> getSupplies(LocalDate firstDate, LocalDate lastDate) {
        return supplyRepository.getSupplies(firstDate, lastDate);
    }
}
