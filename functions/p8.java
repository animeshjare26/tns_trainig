package functions;

import java.util.Scanner;

public class p8 {

    public static int binToDec(int binary){

        int decimal = 0;
        int power = 0;

        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * (int)Math.pow(2, power);
            binary = binary / 10;
            power++; 
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number :");
        int binary = sc.nextInt();
        int convert = binToDec(binary);
        System.out.println("Binary to decimal conversion of "+binary+" is :"+convert);
    }
}
