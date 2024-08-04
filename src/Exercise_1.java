import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise_1
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        ArrayList<Integer> scores = new ArrayList<>();
        int marks;

//         input marks
        String numStudentsString = JOptionPane.showInputDialog("How many student's marks are you entering?");
        int numStudents = Integer.parseInt(numStudentsString);

        for (i = 0; i < numStudents; i++)
        {
            String markString = JOptionPane.showInputDialog("Enter your marks");
            marks = Integer.parseInt(markString);
            scores.add(marks);
        }

//         find the best score
        int best = Collections.max(scores);

//         assign grades in the weirdest way possible
        StringBuilder result = new StringBuilder();
        for (i = 0; i < scores.size(); i++)
        {
            int score = scores.get(i);
            char grade;
            if (score >= best - 10)
            {
                grade = 'A';
            }
            else if (score >= best - 20)
            {
                grade = 'B';
            }
            else if (score >= best - 30)
            {
                grade = 'C';
            }
            else if (score >= best - 40)
            {
                grade = 'D';
            }
            else
            {
                grade = 'F';
            }
            result.append("Student ").append(i + 1).append(": ").append(grade).append("\n");
        }

//        output the marks and such
        JOptionPane.showMessageDialog(null, result.toString());
    }

}

