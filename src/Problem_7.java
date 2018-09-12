/**
 * Created by Petter Glad-Ørbak on 12.09.2018.
 */
public class Problem_7
{
    public static void main(String[] args)
    {
        /*

        Task: What is the 10 001st prime number?

         */
        int primeCounter = 0;
        int loopcounter = 0;

        while(primeCounter != 10001)
        {
            loopcounter++;
            if(isPrime(loopcounter))
            {
                primeCounter++;
            }

        }
        System.out.println(loopcounter);


    }

    // Checks if number is a prime number.
    public static boolean isPrime(long number)
    {
        if(number%2 == 0)
        {
            return false;
        }

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
