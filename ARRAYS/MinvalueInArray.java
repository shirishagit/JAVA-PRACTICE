public class MinvalueInArray {
    public static void main(String[] args) {
        int[] ary = {3,8,4,2,44,9,7};
        int minval = ary[0];
        for (int i : ary) {
            if (minval>i) 
                  minval = i;    
        }
        System.out.println("Lowest Value in the array is : " + minval);
       
    }
}
