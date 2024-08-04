import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercise_26
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;

//        input
        String userInputOne = JOptionPane.showInputDialog("Enter the number of values in your first list followed by a ; and then separate each value of the list with a ;");
        String userInputTwo = JOptionPane.showInputDialog("Enter the number of values in your first list followed by a ; and then separate each value of the list with a ;");

//        separate values
        String[] enteredValuesOne = userInputOne.split(" ");
        String[] enteredValuesTwo = userInputTwo.split(" ");

//        gets the size
        int sizeOfListOne = Integer.parseInt(enteredValuesOne[0]);
        int sizeOfListTwo = Integer.parseInt(enteredValuesTwo[0]);

//        declare arrays using newfound size
        int[] list1 = new int[sizeOfListOne];
        int[] list2 = new int[sizeOfListTwo];

//        loops to put stuff in the arrays
        for (i = 0; i < sizeOfListOne; i++)
        {
            list1[i] = Integer.parseInt(enteredValuesOne[i + 1]);
        }
        for (i = 0; i < sizeOfListTwo; i++)
        {
            list2[i] = Integer.parseInt(enteredValuesTwo[i + 1]);
        }

//        method call
        int[] mergedList = merge(list1, list2);

//        output
        JOptionPane.showMessageDialog(null, "Merged List: " + Arrays.toString(mergedList));
    }


    public static int[] merge(int[] list1, int[] list2)
    {
//        the ints needed are declared here bc its faster
        int i = 0;
        int a = 0;
        int b = 0;
        int[] mergedList = new int[list1.length + list2.length];

        while (i < list1.length && a < list2.length)
        {
            if (list1[i] <= list2[a])
            {
                mergedList[b++] = list1[i++];
            }
            else
            {
                mergedList[b++] = list2[a++];
            }
        }

        while (i < list1.length)
        {
            mergedList[b++] = list1[i++];
        }

        while (a < list2.length)
        {
            mergedList[b++] = list2[a++];
        }

        return mergedList;
    }
}
