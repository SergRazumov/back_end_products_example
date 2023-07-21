package ru.products.back_end_products_example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.products.back_end_products_example.model.Producer;
import ru.products.back_end_products_example.model.Product;
import ru.products.back_end_products_example.model.Supply;
import ru.products.back_end_products_example.services.SupplyService;

import java.time.LocalDate;

@RestController
public class SupplyController {
    private final SupplyService supplyService;

    public SupplyController(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    @PostMapping("addProducer")
    public Producer addProducer(@RequestBody Producer producer) {
        return supplyService.addProducer(producer);
    }

    @PostMapping("addProduct")
    public Product addProduct(@RequestBody Product product) {
        return supplyService.addProduct(product);
    }

    @PostMapping("addSupply")
    public Supply addSupply(@RequestBody Supply supply) {
        return supplyService.addSupply(supply);
    }

    @GetMapping("getSupplies")
    public void getSupplies (){
        System.out.println(supplyService.getSupplies(LocalDate.of(2023,12, 1), LocalDate.of(2023,12, 2)));
    }



}
