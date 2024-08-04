import javax.swing.*;

public class Exercise_15
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        int a;

//        input the size
        String sizeString = JOptionPane.showInputDialog("How many student's do you have?");
        int SIZE = Integer.parseInt(sizeString);

//        the arrays
        String[] studentNames = new String[SIZE];
        int[] studentScores = new int[SIZE];


//        enter stuff correct number of times
        for(i = 0; i < SIZE; i++)
        {
            String enteredNames = JOptionPane.showInputDialog("Student " + i + "'s name?");
            studentNames[i] = enteredNames;

            String enteredScores = JOptionPane.showInputDialog("Student " + i + "'s mark?");
            int scores = Integer.parseInt(enteredScores);
            studentScores[i] = scores;
        }

//        sort the scores in decending order while keeping
//        the scores with the right names
        for (i = 0; i < SIZE - 1; i++)
        {
            for (a = i + 1; a < SIZE; a++)
            {
                if (studentScores[i] < studentScores[a])
                {
//                    regular sorting stuff, moves numbers around
                    int tempScore = studentScores[i];
                    studentScores[i] = studentScores[a];
                    studentScores[a] = tempScore;

//                    this part does the same sort to the names
//                    it means that the names move to the same
//                    spot as the numbers
                    String tempName = studentNames[i];
                    studentNames[i] = studentNames[a];
                    studentNames[a] = tempName;
                }
            }
        }

//        output the names and scores
        StringBuilder result = new StringBuilder("Student's marks:\n");
        for (i = 0; i < SIZE; i++)
        {
            result.append(studentNames[i]).append(": ").append(studentScores[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());

    }
}

