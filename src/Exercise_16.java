import javax.swing.*;
import java.util.Arrays;

public class Exercise_16
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        double[] doubleValues = new double[10];

        for (i = 0; i < doubleValues.length; i++)
        {
            String userInput = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
            doubleValues[i] = Double.parseDouble(userInput);
        }


//        call the method to sort the array
        String arraySortedUp = sortingMethodUp(doubleValues);
        String arraySortedDown = sortingMethodDown(doubleValues);
        JOptionPane.showMessageDialog(null, "The array sorted acending is: " + arraySortedUp + "\n" + "The array sorted decending is: " + arraySortedDown);

    }

//    this sort is acending
    public static String sortingMethodUp (double[] doubleValues)
    {
//        the ints needed are declared here bc its faster
        int i;
        int a;

        for (i = 0; i < doubleValues.length - 1; i++)
        {
            for (a = 0; a < doubleValues.length - 1; a++)
            {
                if (doubleValues[a] > doubleValues[a + 1])
                {
//                    when sorting doubles, you declare temp with double
                    double temp = doubleValues[a];
                    doubleValues[a] = doubleValues[a + 1];
                    doubleValues[a + 1] = temp;
                }
            }
        }

        return Arrays.toString(doubleValues);
    }

//    this sorts it decending
    public static String sortingMethodDown (double[] doubleValues)
    {
//        the ints needed are declared here bc its faster
        int i;
        int a;

        for (i = 0; i < doubleValues.length - 1; i++)
        {
            for (a = 0; a < doubleValues.length - 1; a++)
            {
                if (doubleValues[a] < doubleValues[a + 1])
                {
//                    when sorting doubles, you declare temp with double
                    double temp = doubleValues[a];
                    doubleValues[a] = doubleValues[a + 1];
                    doubleValues[a + 1] = temp;
                }
            }
        }

        return Arrays.toString(doubleValues);
    }

}
