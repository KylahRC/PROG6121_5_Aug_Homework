import java.util.Arrays;

public class Exercise_11
{
    public static void main(String[] args)
    {

//        array of integers
        int[] Integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        code to display in normal order

        System.out.println("Normal order: ");
        System.out.println(Arrays.toString(Integers));

//        code to display in reverse order
        reverseArray(Integers);

//        output
        System.out.println("Reverse order: ");
        System.out.println(Arrays.toString(Integers));

    }

//    method to reverse the array
    public static int[] reverseArray(int[] array)
    {
//        the ints needed are declared here bc its faster
        int i;
        int temp;
        int length = array.length;
        for (i = 0; i < length / 2; i++)
        {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        return array;
    }
}

