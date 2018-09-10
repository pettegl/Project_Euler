/**
 * Created by Petter Glad-Ørbak on 10.09.2018.
 */
public class Problem_2 {

    public static void main(String[] args)
    {
        int fibSum = 0;

        int maxValue = 4000000;
        int previousNumber = 0;
        int nextNumber = 1;
        int sum = 0;


        while(sum < maxValue)
        {
            sum = previousNumber + nextNumber;
            if(sum%2 == 0)
            {
                fibSum += sum;
            }
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        System.out.println(fibSum);

    }
}
