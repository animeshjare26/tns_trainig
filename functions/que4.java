package functions;

public class que4 {

    public static int sumOfDigits(int n ){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sume = sumOfDigits(4255);
        System.out.println(sume);
    }
}
