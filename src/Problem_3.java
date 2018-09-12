import java.math.BigInteger;

/**
 * Created by Petter Glad-Ørbak on 10.09.2018.
 */
public class Problem_3
{
    public static void main(String[] args)
    {
        /*

        Task: Find the largest prime factor of the number 600851475143.

         */
        long n = 600851475143L;
        long largestPrimeFactor = 2;

        while(n > largestPrimeFactor)
        {
            if(n % largestPrimeFactor == 0)
            {
                n = n/largestPrimeFactor;
            }
            else
            {
                largestPrimeFactor++;
            }
        }
        System.out.println(n);

    }

    public static boolean isPrime(long number)
    {
        if(number%2 == 0)
        {
            return false;
        }
        //if not, then just check the odds
        for(int i=3;i*i<=number;i+=2) {
            if(number%i == 0)
                return false;
        }
        return true;
    }
}
