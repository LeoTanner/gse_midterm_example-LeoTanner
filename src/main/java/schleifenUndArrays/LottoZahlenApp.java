package schleifenUndArrays;

import java.sql.Array;

public class LottoZahlenApp
{
    public static void main(String[] args) {

        generateRandomNumbers(6,45);

    }
    public static int[]generateRandomNumbers (int size, int maxNumber)
    {
        int[] arr;
        arr = new int[size];

        int number;

        for(int i = 0; i < size;i++)
        {
            number = (int) (Math.random() * maxNumber + 1);
            arr[i] = number;
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
