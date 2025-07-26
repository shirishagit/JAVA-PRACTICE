public class AddTwoNum {

    public static void main(String[] args) {
        int[] TwoNumbers = {1,4,3,5,2};
        int tar = 6;
         int[] result = SumOfTwo(TwoNumbers,tar);
          if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No matching pair found.");
        }
    }
    public  static int[] SumOfTwo(int[] num,int target){

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j]== target) {
                    return new int[] {i,j};
                }
                
            }
        }
        return new int[] {};
    }
}
