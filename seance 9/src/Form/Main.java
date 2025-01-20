package Form;

import Form.Form;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Form> form = new ArrayList<>();

        Rectangle r1 = new Rectangle(20, 2);
        Rectangle r2 = new Rectangle(10, 3);
        Cercle c1 = new Cercle(3.4);
        Cercle c2 = new Cercle(5.9);

        form.add(r1);
        form.add(r2);
        form.add(c1);
        form.add(c2);

        form.forEach(forme -> System.out.println(forme.calculAir()));
        form.forEach(Form::calculAir);

    }
}
