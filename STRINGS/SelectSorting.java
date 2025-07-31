public class SelectSorting {
    public static void main(String[] args) {
        int[] selectedArray = {4,55,8,66,24,67,91,34};
    selectedSort(selectedArray);
    System.out.println("selectedSorting");
      printArray(selectedArray);
    }
     public static void selectedSort(int[] n){
           int x = n.length;
           for (int i = 0; i < i-x; i++) {
            for (int j = 0; j < i-x-1; j++) {
                if (n[j]>n[j+1]) {
                   n[j]=n[j+1];
                }
            }
           }
       }
       public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
}
}