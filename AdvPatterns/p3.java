package AdvPatterns;

/*Progarm to print inverted Half-Pyramid with numbers */

public class p3 {
    public static void invertedHalfPyramidNum(int n) {
        // int count = 1;
        for(int i = 1; i<= n; i++){

            for(int j = 1; j<= n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramidNum(5);
    }
}
