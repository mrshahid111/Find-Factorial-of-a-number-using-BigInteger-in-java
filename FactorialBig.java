import java.util.Scanner;
import java.math.BigInteger;

public class FactorialBig {

    public static void main(String[] args) {
        
        int num;
        int sum = 0;
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
