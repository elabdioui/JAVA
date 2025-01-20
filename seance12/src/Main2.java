import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.*;

public class Main2 {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("C:\\Users\\elabd\\Desktop\\formation\\4IIR\\S7\\JAVA\\seance12\\input.txt");
        String s = "Quelque text";

        Files.write(p, s.getBytes(StandardCharsets.UTF_16));

        Path p2 = Paths.get("C:\\Users\\elabd\\Desktop\\formation\\4IIR\\S7\\JAVA\\seance12\\output.txt");

        Files.write(p2, "Bonjour \nGestion des fichiers \nfin du fichier ".getBytes(StandardCharsets.UTF_16));


        System.out.println(Files.readString(p2,StandardCharsets.UTF_16).length());

        Path p3 = Paths.get("C:\\Users\\elabd\\Desktop\\formation\\4IIR\\S7\\JAVA\\seance12\\no-empty.txt");

        Files.write(p3, p2.toString().trim().getBytes(StandardCharsets.UTF_16));





        Path p4 = Paths.get("C:\\Users\\elabd\\Desktop\\formation\\4IIR\\S7\\JAVA\\seance12");

                for(File f : p4.toFile().listFiles()) {
                    System.out.println(f.toString());
                }



                try(BufferedReader br = Files.newBufferedReader(p2, StandardCharsets.UTF_16)) {
                    for(String line = br.readLine(); line != null; line = br.readLine()) {


                        if(line.contains("Bonjour")) {
                            System.out.println("existe");
                        }



                    }
                }catch(IOException ioe) {
                    ioe.printStackTrace();
                }




    }
}
