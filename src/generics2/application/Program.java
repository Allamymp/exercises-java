package generics2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {


    public static void main(String[] args) {

        Path path = Paths.get(System.getProperty("user.dir"), "src", "generics2", "FileExercise.csv");

        String pathStr = path.toAbsolutePath().toString();

        try (BufferedReader br = new BufferedReader(new FileReader(pathStr))) {


        }
        catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }



}
