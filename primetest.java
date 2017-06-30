import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class primetest
{
   public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < input; i++)
        {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    isPrimeNumber = false;
                    break; 
                }
            }
            if (isPrimeNumber) 
            {
                primes.add(i);
            }
        }
        System.out.println("The number of prime is: " + primes.size());
    }
}
