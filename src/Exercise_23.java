import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exercise_23
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        int a;
        int[] enteredNumbers = new int[10];

        JOptionPane.showMessageDialog(null, "I will warn you now, this is the most annoying program output you will ever experience.\nIt displays each combination 1 at a time, its the only way I could figure out how to do it");

//        loop that gets input and puts it in the array
        for (i = 0; i < 10; i++)
        {
//            making the input as annoying as the output
            String userInput = JOptionPane.showInputDialog("Enter number 1 " + (i + 1) + ":");
            enteredNumbers[i] = Integer.parseInt(userInput);
        }

//        output the different combinations
        for (i = 0; i < enteredNumbers.length; i++)
        {
            for (a = 0; a < enteredNumbers.length; a++)
            {
                String outputCombinations = (enteredNumbers[i] + ", " + enteredNumbers[a]);
                JOptionPane.showMessageDialog(null, outputCombinations);
            }
        }
    }
}
