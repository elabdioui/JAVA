import java.io.File;
import java.io.IOException;
import java.lang.System;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\elabd\\Desktop\\Data\\first.py");

        File d = new File("C:\\Users\\elabd\\Desktop\\Data\\firsit.py");


        if (f.exists()){
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

        File directry = new File("C:\\Users\\elabd\\Desktop\\Data");

        if(directry.mkdir()){
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
    }
}