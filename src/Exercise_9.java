import javax.swing.JOptionPane;

public class Exercise_9
{
//    the program to enter numbers
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
//        array to store input
        double[] numbersEntered = new double[10];

        for (i = 0; i < numbersEntered.length; i++)
        {
            String userInput = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
            numbersEntered[i] = Double.parseDouble(userInput);
        }

//        this line makes the data go into the method and work out the smallest number
        double smallestNumber = min(numbersEntered);
        JOptionPane.showMessageDialog(null, "The minimum value is: " + smallestNumber);
    }

//    the method to find the smallest value
    public static double min(double[] array)
    {
//        the ints needed are declared here bc its faster
        int i;
        double smallestValue = array[0];
        for (i = 1; i < array.length; i++)
        {
            if (array[i] < smallestValue)
            {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
}
