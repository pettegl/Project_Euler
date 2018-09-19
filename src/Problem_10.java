import java.util.ArrayList;
import java.util.List;

/**
 * Created by Petter Glad-Ørbak on 19.09.2018.
 */
public class Problem_10
{
    public static void main(String[] args)
    {

        /*
        Find the sum of the primes below 2 million.
         */

        List<Long> primes = new ArrayList<Long>();

        for(int i = 1; i < 2000000; i++)
        {
            if(isPrime(i))
            {
                primes.add((long)i);
            }
        }
        double sum = 1.0;

        for(long l : primes)
        {
            sum += l;
        }
        System.out.println("Sum of primes below 2 million: " + sum);
    }

    public static boolean isPrime(long number)
    {
        if(number%2 == 0)
        {
            return false;
        }
        //if not, then just check the odds
        for(int i = 3; i*i <= number; i += 2)
        {
            if(number%i == 0)
            {
                return false;
            }

        }
        return true;
    }
}
