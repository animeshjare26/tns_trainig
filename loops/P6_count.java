package loops;

/*Count the number of digits in a number */

import java.util.*;
public class P6_count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();
    int count =0;

    while(num>0){
       num = num/10;
       count++;
    }
    System.out.println("Count :"+ count);
    
    
    sc.close();
  }  
}
