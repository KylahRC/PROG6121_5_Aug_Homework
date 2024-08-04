import java.util.Random;

//        not sure if this was meant to be the same as Ex 6, but it sounded like it
public class Exercise_7
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int i;
//        array to store the times each number happens
        int[] timesHappened = new int[10];
//        thing that lets me make numbers happen
        Random randomFunction = new Random();

//        loop that makes 100 numbers and then counts the times they happened
        for (i = 0; i < 100; i++)
        {
//            this makes the random number
            int randomNumberGenerated = randomFunction.nextInt(10);
//            this counts the number of times the number was generated
            timesHappened[randomNumberGenerated]++;
        }

//        display the number of times each number was made
        System.out.println("How many times was each number generated?");
        for (i = 0; i < timesHappened.length; i++)
        {
            System.out.println("No. " + i + ": " + timesHappened[i] + " times.");
        }
    }
}

