public class StringClass {
    public static void main(String[] args){
        int[] MyArray = {3,8,4,2,0,6};
        SortArray(MyArray);
        System.out.println("Sorted Array:");
        printArray(MyArray);
    }
    public static void SortArray(int[] n){
          int a = n.length;
          for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < a-i-1; j++) {
                if (n[j] > n[j+1]) {
                    int temp = n[j];
                    n[j] =n[j+1];
                    n[j+1] = temp;
                }
            }
          }
        }
      public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        // System.out.println();
      }
        
        
    }

