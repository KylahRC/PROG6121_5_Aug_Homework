import javax.swing.*;

public class Exercise_21
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;

//        inputs
        String userValuesFirst= JOptionPane.showInputDialog("Enter the number of values in your first list followed by a ; and then separate each value of the list with a ;");
        String userValuesSecond = JOptionPane.showInputDialog("Enter the number of values in your second list followed by a ; and then separate each value of the list with a ;:");

//        thing to separate the values, means no input loop
        String[] stringIntegersFirst= userValuesFirst.split(";");
        String[] stringIntegersSecond = userValuesSecond.split(";");

//        gets the size
        int sizeListOne = Integer.parseInt(stringIntegersFirst[0]);
        int sizeListTwo = Integer.parseInt(stringIntegersSecond[0]);

//        the arrays declared
        int[] list1 = new int[sizeListOne];
        int[] list2 = new int[sizeListTwo];

//        adding stuff to arrays starting at index 1
        for (i = 0; i < sizeListOne; i++)
        {
            list1[i] = Integer.parseInt(stringIntegersFirst[i + 1]);
            list2[i] = Integer.parseInt(stringIntegersSecond[i + 1]);
        }

//        the method calls
        boolean lengthsAreTheSame = lengthCheck(sizeListOne, sizeListTwo);
        boolean valuesAreTheSame = equals(list1, list2);

//        decides what response is needed
        if (lengthsAreTheSame)
        {
            if (valuesAreTheSame)
            {
                JOptionPane.showMessageDialog(null, "The two lists are strictly identical.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The two lists are not strictly identical.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The two lists are not strictly identical.");
        }
    }

//    checks if theyre the same length first bc why check values if its different lengths
    public static boolean lengthCheck(int sizeListOne, int sizeListTwo)
    {
        if (sizeListOne != sizeListTwo)
        {
            return false;
        }
        return true;
    }


    public static boolean equals(int[] list1, int[] list2)
    {
//        the ints needed are declared here bc its faster
        int i;
        if (list1.length != list2.length)
        {
            return false;
        }
        for (i = 0; i < list1.length; i++)
        {
            if (list1[i] != list2[i])
            {
                return false;
            }
        }
        return true;
    }
}
