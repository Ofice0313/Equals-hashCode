package application;

import entities.Product;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product product = new Product("Notebook", 1200.0);

        System.out.println(set.contains(product));

        System.out.println();
        for (Product p: set)
            System.out.println(p);
    }
}
