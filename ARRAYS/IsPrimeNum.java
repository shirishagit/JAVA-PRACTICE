public class IsPrimeNum {
     public static boolean isPrime(int num){
         if (num<2) return false;
         for (int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0)
                return false;
            
           
         }
          return true;
    }

    public static void main(String[] args) {
        int[] ar = {3,5,2,9,6,12,14,18,17};
        for (int i : ar) {
            System.out.println(isPrime(i));
        }
    }  
            
    
}
