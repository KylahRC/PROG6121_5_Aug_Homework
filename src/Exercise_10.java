import javax.swing.JOptionPane;

public class Exercise_10
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
//        array to store input
        double[] numbersEntered = new double[10];
        for (i = 0; i < 10; i++)
        {
            String userInput = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbersEntered[i] = Double.parseDouble(userInput);
        }

//        this line makes the data go into the method and work out where the smallest number is
        int indexOfLowestNumber = indexOfSmallestElement(numbersEntered);
        JOptionPane.showMessageDialog(null, "The smallest number is in index " + indexOfLowestNumber);
    }

//    method to find smallest numbers
    public static int indexOfSmallestElement(double[] array)
    {
//        the ints needed are declared here bc its faster
        int i;
        int indexNumberIsAt = 0;
        for (i = 1; i < array.length; i++)
        {
            if (array[i] < array[indexNumberIsAt])
            {
                indexNumberIsAt = i;
            }
        }
        return indexNumberIsAt;
    }
}
