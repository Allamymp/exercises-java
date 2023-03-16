package generics2.application;

import generics2.entities.Product;
import generics2.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {


    public static void main(String[] args) {

        Path path = Paths.get("C:\\Programacao\\Workspace\\exercicios_4\\src\\generics2\\FileExercise.csv");

        String pathStr = path.toAbsolutePath().toString();
        Locale.setDefault(Locale.US);

        List<Product> productsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathStr))) {

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                productsList.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line= br.readLine();


            }


        }
        catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }

        Product mostExpensive = CalculationService.calculateExpensive(productsList);
        System.out.println("Most expensive:");
        System.out.println(mostExpensive.toString());

    }



}
