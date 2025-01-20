import java.io.*;
import java.nio.*;
import java.io.IOException;
import java.lang.System;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\elabd\\Desktop\\Data\\first.py");

        File d = new File("C:\\Users\\elabd\\Desktop\\Data\\firsit.py");


        if (f.exists() ){
            System.out.println("File exists");
        }
        else{
            System.out.println("File does not exist");
        }
        if (d.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File does not exist");
        }

        File directory = new File("C:\\Users\\elabd\\Desktop\\Data");

        if(directory.mkdir()){
            System.out.println("Directory created");
        }
        else{
            System.out.println("Directory does not exist");
        }
        File newfile = new File("C:\\Users\\elabd\\Desktop\\Data\\new.py");
        if(newfile.createNewFile()){
            System.out.println("New file created");
        }
        else {
            System.out.println("New file does not exist");
        }

        if(directory.isDirectory()){
            String[] files = directory.list();
            for (var i : files) {
                System.out.println(i);
            }
        }

        Path absolutePath = Paths.get("C:\\Users\\elabd\\Desktop\\Data");
        Path relativepath =absolutePath.toRealPath();

        System.out.println(absolutePath);
        System.out.println(relativepath);
        System.out.println(absolutePath.getRoot());
        System.out.println(absolutePath.getFileName());
        System.out.println(absolutePath.getParent());




        Path path = Paths.get("C:\\Users\\elabd\\Desktop\\Data\\exemple.txt");
        String content = "Bonjour je suis haitham@ ";

        Files.write(path, content.getBytes(StandardCharsets.UTF_16));

        String content2 = "Bonjour je suis haitham2";

        Files.write(path, content2.getBytes(StandardCharsets.UTF_16), StandardOpenOption.APPEND);


            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_16);
            lines.forEach(System.out::println);


            try(BufferedWriter writer = new BufferedWriter(new FileWriter(("exemple.txt")))) {
                writer.write(content2);
                System.out.println("Written exemple.txt");
            } catch (IOException e) {
               e.printStackTrace();
            }
            try (BufferedReader reader = new BufferedReader(new FileReader("exemple.txt"))) {

                String line ;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            }catch (IOException e){
                e.printStackTrace();
            }


            try(PrintWriter writer = new PrintWriter("exemple.txt", "UTF-8")) {

                writer.println("Bonjour println");

            }catch (IOException e){
                e.printStackTrace();
            }

            try(FileOutputStream fileOutputStream = new FileOutputStream("example.txt")) {

                fileOutputStream.write(content2.getBytes());
            }
            catch (IOException e){
                e.printStackTrace();
            }

            try(FileInputStream fileInputStream = new FileInputStream("example.txt")) {
                int i;
                while ((i = fileInputStream.read()) != -1) {
                    System.out.print( i);
                }
            }catch (IOException e){
                e.printStackTrace();
            }


    }
}