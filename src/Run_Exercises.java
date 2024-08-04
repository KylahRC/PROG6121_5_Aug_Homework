import javax.swing.*;

public class Run_Exercises
{
    public static void main(String[] args)
    {
        while (true)
        {
            JOptionPane.showMessageDialog(null, "Welcome to the Homework, heres some things you need to know:");
            JOptionPane.showMessageDialog(null, "The quality of comments gets worse over time. \nI couldn't do some of the exercises, there wasn't any more time to ask you for help \n I have no idea what its going to look/feel like after running every exercise");
            String runWhichExercise = JOptionPane.showInputDialog("Which exercise do you want to run? Type just the number of the exercise you want to test or type Quit to close the program");

            if (runWhichExercise.equalsIgnoreCase("Quit"))
            {
                break;
            }

            switch (runWhichExercise)
            {
                case "1" -> Exercise_1.main(args);
                case "2" -> Exercise_2.main(args);
                case "3" -> Exercise_3.main(args);
                case "4" -> Exercise_4.main(args);
                case "5" -> Exercise_5.main(args);
                case "6" -> Exercise_6.main(args);
                case "7" -> Exercise_7.main(args);
                case "8" -> Exercise_8.main(args);
                case "9" -> Exercise_9.main(args);
                case "10" -> Exercise_10.main(args);
                case "11" -> Exercise_11.main(args);
                case "12" -> Exercise_12.main(args);
                case "13" -> Exercise_13.main(args);
                case "14" -> Exercise_14.main(args);
                case "15" -> Exercise_15.main(args);
                case "16" -> Exercise_16.main(args);
                case "17" -> Exercise_17.main(args);
                case "18" -> Exercise_18.main(args);
                case "19" -> Exercise_19.main(args);
                case "20" -> Exercise_20.main(args);
                case "21" -> Exercise_21.main(args);
                case "22" -> Exercise_22.main(args);
                case "23" -> Exercise_23.main(args);
                case "24" -> Exercise_24.main(args);
                case "25" -> Exercise_25.main(args);
                case "26" -> Exercise_26.main(args);
                case "27" -> Exercise_27.main(args);
                case "28" -> Exercise_28.main(args);

                default -> JOptionPane.showMessageDialog(null, "No exercise selected");
            }
        }
    }
}
