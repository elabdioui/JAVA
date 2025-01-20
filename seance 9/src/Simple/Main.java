package Simple;

import javax.sql.rowset.Predicate;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public boolean Paire(int x){
        return  (x % 2 == 0) ;

    }
    public int Carre(int x){
        return x * x;
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.forEach(Predicate::P);




    }

}
