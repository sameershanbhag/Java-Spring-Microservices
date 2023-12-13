package com.coffecoder.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//        return (args) -> {
//            Inventory inventory = new Inventory();
//            inventory.setSkuCode("Samsung Galaxy S20");
//            inventory.setQuantity(10);
//
//            Inventory inventory1 = new Inventory();
//            inventory1.setSkuCode("Iphone 15");
//            inventory1.setQuantity(0);
//
//            inventoryRepository.save(inventory);
//            inventoryRepository.save(inventory1);
//        };
//    }

}
