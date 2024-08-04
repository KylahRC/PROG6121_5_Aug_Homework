import javax.swing.*;
import java.util.ArrayList;

public class Exercise_3
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
//        declarations for array and such
        ArrayList<Integer> integers = new ArrayList<>();
//        array to count times a number is entered
        int[] timesEntered = new int[101];
        int integerInt;

//        final input is 0, end input loop when 0 input
        do
        {
            String integerString = JOptionPane.showInputDialog("Enter integers (0 to end): ");
            integerInt = Integer.parseInt(integerString);
            if (integerInt != 0)
            {
                integers.add(integerInt);
            }
        }
        while (integerInt != 0);

//        how many times the number happened
        for (int num : integers)
        {
//          it will ignore any values that aren't between the range
            if (num >= 1 && num <= 100)
            {
                timesEntered[num]++;
            }
        }

//        display the times each number happened
        StringBuilder result = new StringBuilder();
        for (i = 1; i <= 100; i++)
        {
            if (timesEntered[i] > 0)
            {
                result.append(i).append(" was entered ").append(timesEntered[i]).append(" time");
                if (timesEntered[i] > 1)
                {
                    result.append("s");
                }
                result.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
