

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 100 are: ");
       System.out.println();
        for (int num = 1; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.print(num + " ");
            
        
    }
}
    }
}