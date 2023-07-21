package ru.products.back_end_products_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.products.back_end_products_example.services.SupplyService;

import java.time.LocalDate;

@SpringBootApplication
public class BackEndProductsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndProductsExampleApplication.class, args);
	}

}
