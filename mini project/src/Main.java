import banque.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws SoldeNegatifException {

        CompteCourant cc1=new CompteCourant(1,1000,100);
        CompteCourant cc2=new CompteCourant(2,200,100);
        CompteEpargne ce1=new CompteEpargne(1,1000,100);
        CompteEpargne ce2=new CompteEpargne(2,200,100);

        cc1.deposer(100);
        System.out.println(cc1.getSoldeInitial());

        cc1.virement(2000,cc2);

        System.out.println(cc1.getSoldeInitial());
        System.out.println(cc2.getSoldeInitial());


    }
}