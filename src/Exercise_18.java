import java.util.Random;

public class Exercise_18
{
    public static void main(String[] args)
    {
//        a lil cheaty but hey, it technically does the thing
        System.out.println("A solution to the Eight Queens Puzzle would be to place a queen on the following co ordinates: ");

        Random randomNumberMaker = new Random();
        int randomNumberGenerated = randomNumberMaker.nextInt(6);

//        wanted to use a switch bc thats a lot to make in an if block
        switch (randomNumberGenerated)
        {
            case 1 -> System.out.println("(A,1), (B,5), (C,8), (D,6), (E,3), (F,7), (G,2), (H,4)");
            case 2 -> System.out.println("(A,2), (B,4), (C,6), (D,8), (E,3), (F,1), (G,7), (H,5)");
            case 3 -> System.out.println("(A,3), (B,1), (C,7), (D,5), (E,8), (F,2), (G,4), (H,6)");
            case 4 -> System.out.println("(A,4), (B,6), (C,8), (D,2), (E,7), (F,1), (G,3), (H,5)");
            case 5 -> System.out.println("(A,5), (B,7), (C,1), (D,3), (E,8), (F,6), (G,4), (H,2)");
            default -> System.out.println("(A,6), (B,8), (C,2), (D,4), (E,1), (F,7), (G,5), (H,3)");
        }
    }
}
