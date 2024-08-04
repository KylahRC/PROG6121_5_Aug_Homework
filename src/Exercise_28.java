import javax.swing.JOptionPane;
import java.util.Random;

public class Exercise_28
{
//    comments fell off, time just wasn't on my side'
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
        String[] listOfWords = {"cat", "dog", "bird", "fish", "bunny"};
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain)
        {
            String wordChosenFromList = listOfWords[random.nextInt(listOfWords.length)];
            char[] lettersInTheWord = new char[wordChosenFromList.length()];
            for (i = 0; i < lettersInTheWord.length; i++)
            {
                lettersInTheWord[i] = '*';
            }

            int misses = 0;
            boolean gameWon = false;

            while (!gameWon)
            {
                String usersGuess = JOptionPane.showInputDialog(null, "Guess a letter in the word: " + new String(lettersInTheWord));
                if (usersGuess == null || usersGuess.length() != 1)
                {
                    JOptionPane.showMessageDialog(null, "Please enter a single letter.");
                    continue;
                }

                char letterUserGuessed = usersGuess.charAt(0);
                boolean correctGuess = false;

                for (i = 0; i < wordChosenFromList.length(); i++)
                {
                    if (wordChosenFromList.charAt(i) == letterUserGuessed)
                    {
                        lettersInTheWord[i] = letterUserGuessed;
                        correctGuess = true;
                    }
                }

                if (!correctGuess)
                {
                    misses++;
                }

                gameWon = true;
                for (char c : lettersInTheWord)
                {
                    if (c == '*')
                    {
                        gameWon = false;
                        break;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "The word is " + wordChosenFromList + ". You missed " + misses + " times.");

            String playAgainConfirm = JOptionPane.showInputDialog("Do you want to play again? Type Yes if you do");

            if(playAgainConfirm.equalsIgnoreCase("Yes"))
            {
                playAgain = true;
            }
            else
            {
                playAgain = false;
            }

        }
    }
}

