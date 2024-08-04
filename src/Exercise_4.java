import javax.swing.*;
import java.util.ArrayList;


public class Exercise_4
{
    public static void main(String[] args)
    {
//        declarations
        ArrayList<Integer> scores = new ArrayList<>();


//        input values
        while (true)
        {
            String input = JOptionPane.showInputDialog("Enter values (or negative to exit)");
            int inputToInt = Integer.parseInt(input);

//        condition that negative numbers inputted end the loop
            if (inputToInt < 0)
            {
                break;
            }

            scores.add(inputToInt);

        }

//        check for average
        int sum = 0;
        for (int score : scores)
        {
            sum += score;
        }
        double average = (double) sum / scores.size();


//        compare values to average
        StringBuilder aboveAverage = new StringBuilder("Scores above average: ");
        StringBuilder belowAverage = new StringBuilder("Scores below average: ");
        for (int score : scores)
        {
            if (score > average)
            {
                aboveAverage.append(score).append(" ");
            }
            else if (score < average)
            {
                belowAverage.append(score).append(" ");
            }
        }

//        output results
        average = Math.round(average * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "Average score: " + average + " "
                + aboveAverage.toString() + " " + belowAverage.toString());

    }
}
