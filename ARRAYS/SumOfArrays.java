public class SumOfArrays {
    public static void main(String[] args) {
        int[] MyArray = {2,3,4,6,8};
        int sum =0;
        int i;
        for ( i = 0; i < MyArray.length; i++) {  //Loop throught the arry and add the value to sum
            sum +=MyArray[i];
        }
        System.out.println("The sum of Elements are : " + sum);
    }
}
