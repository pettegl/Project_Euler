/**
 * Created by Petter Glad-Ørbak on 12.09.2018.
 */
public class Problem_5
{
    public static void main(String[] args)
    {
         /*

        Task: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

         */
         int counter = 1;

         while(!isEvenlyDivisible(counter))
         {
             counter++;
         }

        System.out.println(counter);

    }
    // Check if number is evenly divisible by numbers 1-20.
    private static boolean isEvenlyDivisible(int number)
    {
        for(int i = 1; i < 20; i++)
        {
            if(number % i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
