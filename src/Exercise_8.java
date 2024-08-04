import javax.swing.JOptionPane;

public class Exercise_8
{
//    program to enter the numbers and output average
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
//        array to store input
        double[] enteredNumbers = new double[10];
        String userInput;

        for (i = 0; i < 10; i++)
        {
            userInput = JOptionPane.showInputDialog("Enter double value " + (i + 1) + ":");
            enteredNumbers[i] = Double.parseDouble(userInput);
        }

        double averageOfNumbers = average(enteredNumbers);
        JOptionPane.showMessageDialog(null, "The average of the numbers you entered is: " + averageOfNumbers);
    }

//    method 1 to calculate average
    public static int average(int[] array)
    {
        int totalInt = 0;
        for (int numbersEntered : array)
        {
            totalInt += numbersEntered;
        }
        return totalInt / array.length;
    }

//    method 2 that does the same as 1? was that the point?
    public static double average(double[] array)
    {
        double totalDouble = 0;
        for (double numbersEntered : array)
        {
            totalDouble += numbersEntered;
        }
        return totalDouble / array.length;
    }
}

