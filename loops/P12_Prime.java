package loops;

/*check whether a number is prime or not */

import java.util.*;

public class P12_Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number :");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n == 2){
            System.out.println(n+" is a prime number");
        }else{
        
        for(int i =2; i <= Math.sqrt(n);i++){
            if(n % i == 0 ){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println(n+" is a  prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
        sc.close();

    
    }
}
 