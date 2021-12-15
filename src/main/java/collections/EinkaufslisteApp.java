package collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EinkaufslisteApp
{
    public static void main(String[] args) {

        ArrayList<Einkauf> einkaufsliste = new ArrayList<Einkauf>();
        einkaufsliste.add(new Einkauf("Butter",20));
        einkaufsliste.add(new Einkauf("Bier",10));
        einkaufsliste.add(new Einkauf("Fleisch",5.5));
        einkaufsliste.add(new Einkauf("Rest",2));
        einkaufsliste.add(new Einkauf("Rest",2));

        HashSet<Einkauf> einkaufHashSet = new HashSet<>(einkaufsliste);


        System.out.println(sum(einkaufsliste));
        System.out.println(sum(einkaufHashSet));
    }

    public static double sum (ArrayList<Einkauf> einkaufsliste)
    {
        double summe = 0;
        for (Einkauf einkauf : einkaufsliste)
        {
            summe = summe + einkauf.getPreis();
        }
        return summe;
    }
    public static double sum (HashSet<Einkauf> einkaufsliste)
    {
        double summe = 0;

        for (Einkauf einkauf : einkaufsliste)
        {
            summe += einkauf.getPreis();
        }
        return summe;
    }
    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufsliste)
    {
        return null;
    }



}
