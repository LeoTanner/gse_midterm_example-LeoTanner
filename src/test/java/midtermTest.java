import collections.Einkauf;
import klassenUndObjekte.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import schleifenUndArrays.LottoZahlenApp;

public class midtermTest
{
    Person pers1;
    Einkauf ek1;
    LottoZahlenApp lz1;
    @BeforeEach
    void setUp()
    {
        pers1 = new Person("Leo","Tanner",180,(byte)4);
        ek1 = new Einkauf("Butter",1.40);
        lz1 = new LottoZahlenApp();
    }

    @Test
    void person()
    {
        Assertions.assertEquals("Normalgewicht",pers1.rechneBMI(80));
    }

    @Test
    void Einkauf()
    {
        Assertions.assertEquals(1.40,ek1.getPreis());
    }

    @Test
    void random()
    {
        int[] arr = new int[1];
        arr = LottoZahlenApp.generateRandomNumbers(1,1);
        Assertions.assertEquals(1,arr[0]);
    }
}
