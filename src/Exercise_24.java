public class Exercise_24
{
    public static void main(String[] args)
    {
//        the ints needed are declared here bc its faster
        int[] cardPickOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] cardPickTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int i;
        int a;
        int sumOfCards;
        int countOf24s = 0;

        for (i = 0; i < cardPickOne.length; i++)
        {
            for (a = 0; a < cardPickTwo.length; a++)
            {
                sumOfCards = cardPickOne[i] + cardPickTwo[a];

                if(sumOfCards == 24)
                {
                    countOf24s++;
                }
            }
        }

        System.out.println("The number of card combinations that can make 24 is: " + countOf24s);

    }
}
