import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercise_27
{
    public static void main(String[] args)
    {
//         user input
        String userInput = JOptionPane.showInputDialog("Enter a string of letters to be sorted in alphabetical order");

//         Sort the string
        String alphabetString = sort(userInput);

//         Display the sorted string
        JOptionPane.showMessageDialog(null, "Sorted string: " + alphabetString);
    }

    public static String sort(String s)
    {
//         Convert the string to a char array
        char[] stringToLettersArray = s.toCharArray();

//         Sort the char array
        Arrays.sort(stringToLettersArray);

//         Convert the sorted char array back to a string
        return new String(stringToLettersArray);
    }
}
