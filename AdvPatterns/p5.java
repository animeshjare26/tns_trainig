package AdvPatterns;

public class p5 {

    public static void zeroOneTraiangle(int n ){

        for(int i = 1; i <= 5;i++){

            for(int j = 1; j <= i;j++){

                int sum = i + j;

                if(sum % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        zeroOneTraiangle(4);
        
    }
}
