package loops;

/*Sum  of each digit of  a given number */


import java.util.Scanner;

public class P7_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n = n / 10;

        }
        System.out.println("Sum of each digit is :"+ sum);
        
        sc.close();
    }
    
}
