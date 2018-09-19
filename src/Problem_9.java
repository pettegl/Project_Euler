/**
 * Created by Petter Glad-Ørbak on 19.09.2018.
 */
public class Problem_9
{
    public static void main(String[] args)
    {

        int a = 1, b = 2, c = 3;

        for(int i = 1; i < 998; i++)
        {
            for(int j = 2; j < 999; j++)
            {
                for(int k = 3; k < 1000; k++)
                {
                    if(checkTriplet(i,j,k))
                    {
                        System.out.println("Triplet found: " + i + " " + j + " " + k);
                        System.out.println("Product of triplet: " + (i*j*k));
                        System.exit(0);
                    }

                }
            }
        }



    }
    public static boolean checkTriplet(int a, int b, int c)
    {
        if(a < b && b < c)
        {
            if(((a*a)+(b*b)) == (c*c))
            {
                if((a + b + c) == 1000)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
