package generics2.services;

import generics2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class CalculationService<T>   {

    private List<Product> products;


    public static Product calculateExpensive(List<Product> products ) {

        if (products.isEmpty()) {
            throw new IllegalStateException("Empty list!");
        }

        Product max = products.get(0);
        for (Product price : products) {
            if (price.getPrice() > max.getPrice()) {
                max.setPrice(price.getPrice());
                max.setName(price.getName());
            }

        }
        return max;
    }

}
