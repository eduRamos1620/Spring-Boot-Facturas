package com.eduardo.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.eduardo.springboot.di.factura.springboot_difactura.models.Item;
import com.eduardo.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {
    
    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("Guantes", 1200);
        Product p2 = new Product("Botas", 1400);

        List<Item> items = Arrays.asList(
            new Item(p1, 2),
            new Item(p2, 4)
        );

        return items;
    }

    @Bean
    @Primary
    List<Item> itemsInvoiceMoto(){
        Product p1 = new Product("Balatas", 100);
        Product p2 = new Product("Chicote", 20);
        Product p3 = new Product("Aceite", 210);
        Product p4 = new Product("Liquido de frenos", 80);

        List<Item> items = Arrays.asList(
            new Item(p1, 2),
            new Item(p2, 4),
            new Item(p3, 2),
            new Item(p4, 1)
        );

        return items;
    }
}
