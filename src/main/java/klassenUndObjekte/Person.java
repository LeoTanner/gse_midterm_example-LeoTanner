package klassenUndObjekte;

import java.util.Objects;

public class Person
{
    public String vorname;
    public String nachname;
    public int koerpergroesse;
    public Byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return koerpergroesse == person.koerpergroesse && aktivitaetslevel == person.aktivitaetslevel && Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, koerpergroesse, aktivitaetslevel);
    }

    @Override
    public String toString() {
        return "klassenUndObjekte.Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", koerpergroesse=" + koerpergroesse +
                ", aktivitaetslevel=" + aktivitaetslevel +
                '}';
    }

    public String rechneBMI (int gewicht)
    {
        double groesse = koerpergroesse;
        double bmi = gewicht / ((groesse / 100.0) * (groesse / 100.0));
        String bmioutput = "Untergewicht";
        if (bmi < 18.5)
        {
            bmioutput = "Untergewicht";
        }
        else if (18.5 <= bmi && bmi < 25)
        {
            bmioutput = "Normalgewicht";
        }
        else if (25 <= bmi && bmi < 30)
        {
            bmioutput = "Übergewicht";
        }
        else
        {
            bmioutput = "Adipositas";
        }
        return bmioutput;
    }

    public void printPerson(int gewicht)
    {
        String akt = "";
        switch(getAktivitaetslevel())
        {
            case 1: akt = "Couch Potato"; break;
            case 2: akt = "Gelegenheitssportler"; break;
            case 3: akt = "Sportler"; break;
            case 4: akt = "Profisportler"; break;
        }
        System.out.println(""+getVorname()+", "+akt+", "+rechneBMI(gewicht));
    }
}
