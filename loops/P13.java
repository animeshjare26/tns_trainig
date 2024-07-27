package loops;

/* Write a program that reads a set of integers, and then prints the sum of the
even and odd integers. */

import java.util.*;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int  choice;
        int evenNumber = 0;
        int oddNumber = 0;

        do{
            System.out.println("Enter a  number :");
            number = sc.nextInt();
            
            if(number % 2 == 0){
                evenNumber += number;
            }else{
                oddNumber += number;
            }
            System.out.println("Do you want to continue adding numbers then press 1 otherwise press 0");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("Sum of even Numbers is : "+ evenNumber);
        System.out.println("Sum of odd Numbers is : "+ oddNumber);
        
        sc.close();


    }
}
