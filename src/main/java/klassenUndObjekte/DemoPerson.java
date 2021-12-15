package klassenUndObjekte;

public class DemoPerson
{
    public static void main(String[] args) {
        Person pers1 = new Person("Leo","Tanner",183, (byte)4);
        Person pers2 = new Person("Patrick", "Putzi", 111, (byte)1);

        System.out.println(pers1.rechneBMI(82));
        pers1.printPerson(82);
    }
}
