public class LoopOverArray {
    public static void main(String[] args) {
        int[][] x = {{1,3,5,7,9,11},{0,2,4,6,8,10}};  // this is a 2 dimensional array
        for(int[] x1 :x){
            for(int x2:x1){ 
               System.out.println(x2);  //this is an enhanced version of loop over array
            }
        }
    }
}
