import javax.swing.*;

public class Exercise_17
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        String userInput = JOptionPane.showInputDialog("Enter the number of values in your list followed by a ; and then separate each value of the list with a ;");
        String[] numberOfValuesInList = userInput.split(";");

//        gets the size from the input
        int SIZE = Integer.parseInt(numberOfValuesInList[0]);
        int[] listToBeLookedAt = new int[SIZE];

//        loop needs it to be i + 1 bc i = 0 is the size
        for (i = 0; i < SIZE; i++)
        {
            listToBeLookedAt[i] = Integer.parseInt(numberOfValuesInList[i + 1]);
        }

        boolean sortedOrNot = checksIfSortedOrNot(listToBeLookedAt);

        if (sortedOrNot)
        {
            JOptionPane.showMessageDialog(null, "Sorted");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not sorted");
        }

    }


    public static boolean checksIfSortedOrNot(int[] listToBeLookedAt)
    {
//        the ints needed are declared here bc its faster
        int i;
        for (i = 0; i < listToBeLookedAt.length - 1; i++)
        {
            if (listToBeLookedAt[i] > listToBeLookedAt[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
