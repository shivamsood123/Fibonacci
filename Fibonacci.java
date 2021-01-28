package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n;
        int first = 0, second = 1;
        System.out.println("Enter Number of terms:  ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.println("Fibonacci Series is ");
        
        for(int i = 1; i <= n; ++i)
        {
            System.out.println(first);
            
            int sum = first + second;
            first = second;
            second = sum;
            
        }
        
    }
    
}
