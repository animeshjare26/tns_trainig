package Recursion;

public class Tiles {

    public static int tillingProblem(int n ) {
        
        //BAse Case
        if( n== 0 || n ==1){
            return 1;
        }
        //vertical choice

        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n - 2);

        //total ways
        int  totalWays = fnm1+ fnm2;

        return totalWays;
    }
    
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    } 
}
