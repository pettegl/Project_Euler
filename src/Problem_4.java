/**
 * Created by Petter Glad-Ørbak on 12.09.2018.
 */
public class Problem_4
{
    public static void main(String[] args)
    {
         /*

        Task: Find the largest palindrome that is a product of two 3-digit numbers.

         */

         int largestPalindrome = 0;

         for(int i = 1; i < 999; i++)
         {
             for(int k = 1; k < 999; k++)
             {
                 if(isPalindrome(i * k) && (i * k) > largestPalindrome)
                 {
                     largestPalindrome = (i * k);
                 }
             }
         }

        System.out.println(largestPalindrome);

    }
    // Returns true if n is a palindrome.
    private static boolean isPalindrome(int n)
    {

        String s = "" + n;
        int length = s.length();

        if(s.length() % 2 == 0)
        {
            String a = s.substring(0,s.length()/2);
            String b = s.substring(s.length()/2,s.length());
            String c = "";

            for(int i = b.length(); i >= 1; i--)
            {
                c += b.charAt(i-1);
            }

            if(a.equals(c))
            {
                return true;
            }
        }
        return false;
    }
}
