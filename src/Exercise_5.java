import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exercise_5
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        int a;
//        declarations
        ArrayList<Integer> singleNumbers = new ArrayList<>();

//        input loop for 10 numbers
        for (i = 0; i < 10; i++)
        {
            String input = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            int inputInt = Integer.parseInt(input);
            boolean isNewNumber = true;

//            checks if the number exists in the array already
            for (a = 0; a < singleNumbers.size(); a++)
            {
                if (singleNumbers.get(a) == inputInt)
                {
                    isNewNumber = false;
                    break;
                }
            }

//            if it doesn't it gets added here
            if (isNewNumber)
            {
                singleNumbers.add(inputInt);
            }
        }

//        outputs the numbers entered leaving out duplicates
        System.out.println("Numbers that were entered (no duplicates): " + singleNumbers);
    }
}