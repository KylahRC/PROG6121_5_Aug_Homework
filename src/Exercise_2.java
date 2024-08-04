import java.util.Arrays;

public class Exercise_2
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int a;
        int b;
//        array of integers
        int[] Integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        code to display in normal order

        System.out.println("Normal order: ");
        System.out.println(Arrays.toString(Integers));

//        code to display in reverse order

        for (a = 0; a < Integers.length - 1; a++)
        {
            for (b = 0; b < Integers.length - 1; b++)
            {
                if (Integers[b] < Integers[b + 1])
                {
                    int temp = Integers[b];
                    Integers[b] = Integers[b + 1];
                    Integers[b + 1] = temp;
                }
            }
        }

//        output
        System.out.println("Reverse order: ");
        System.out.println(Arrays.toString(Integers));

    }
}