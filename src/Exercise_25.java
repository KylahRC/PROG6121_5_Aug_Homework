import javax.swing.*;

public class Exercise_25
{
    public static void main(String[] args)
    {
        String sizeString = JOptionPane.showInputDialog("How many values are you entering?");

//        the ints needed are declared here bc its faster
        int SIZE = Integer.parseInt(sizeString);
        int[] values = new int[SIZE];
        int i;

//        I like this input style, I will use it inconsistently bc yes
        String userInput = JOptionPane.showInputDialog("Enter values to go into array separated by ;");
        String[] inputToInt = userInput.split(";");

//        adds stuff to array
        for(i = 0; i < values.length; i++)
        {
            values[i] = Integer.parseInt(inputToInt[i]);
        }

//        method call
        boolean fourInARow = isConsecutiveFour(values);

//        decides output
        if (fourInARow)
        {
            JOptionPane.showMessageDialog(null, "There was a sequence of 4-in-a-row values");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "There were no 4-in-a-row values");
        }

    }

//    method to look for 4 in a row
    public static boolean isConsecutiveFour(int[] values)
    {
//        the ints needed are declared here bc its faster
        int i;
        for (i = 0; i < values.length - 3; i++)
        {
            if(values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3])
            {
                 return true;
            }
        }
        return false;
    }
}
