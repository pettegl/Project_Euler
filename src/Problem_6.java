/**
 * Created by Petter Glad-Ørbak on 12.09.2018.
 */
public class Problem_6
{
    public static void main(String[] args)
    {
        /*

        Task: Find the difference between the sum of the squares of the
        first one hundred natural numbers and the square of the sum.

         */
        System.out.println(squareOfSum() - sumOfSquares());
    }

    // Returns the sum of squares of the numbers 1 to 100.
    private static int sumOfSquares()
    {
        int sum = 0;

        for(int i = 1; i <= 100; i++)
        {
            sum += (i*i);
        }
        return sum;
    }

    // Returns the square of the sum of numbers 1 to 100.
    private static int squareOfSum()
    {
        int sum = 0;

        for(int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        return (sum*sum);
    }
}
