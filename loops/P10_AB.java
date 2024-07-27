package loops;

/*Find a raise to the power b  / a^b  */

import java.util.Scanner;

public class P10_AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int raise = 1;

        for(int i = 1;i<=b;i++){
            raise *=a;
        }
        System.out.println(a + " to the power"+ b + "is :"+raise);
        sc.close();



        
    }
    
}
