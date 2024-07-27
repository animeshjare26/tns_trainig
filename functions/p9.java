package functions;

import java.util.Scanner;

public class p9 {
    public static int decToBin(int num) {

        int binary = 0;
        int power =0;
        
        while(num > 0){
            int remainder = num  % 2;
            binary = binary + remainder * (int)Math.pow(10, power);
            power++;
            num = num/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        int convert = decToBin(n);
        System.out.println("Decimal to binary converison of"+n+" is :"+ convert);
    }

}
