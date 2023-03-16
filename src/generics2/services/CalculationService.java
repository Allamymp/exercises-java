package generics2.services;

import generics2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class CalculationService<T>   {

    private List<Product> products;


    public static <T extends Comparable<? super T>> T calculateExpensive(List<T > products ) {

        if (products.isEmpty()) {
            throw new IllegalStateException("Empty list!");
        }

        T max = products.get(0);
        for (T price : products) {
            if (price.compareTo(max)>0) {
                max = price;
            }

        }
        return max;
    }

}
