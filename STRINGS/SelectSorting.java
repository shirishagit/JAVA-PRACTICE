public class SelectSorting {
    public static void main(String[] args) {
        int[] selectedArray = {4,55,8,66,24,67,91,34};
    selectedSort(selectedArray);
    System.out.println("selectedSorting");
      printArray(selectedArray);
    }
     public static void selectedSort(int[] n){
           int x = n.length;
           for (int i = 0; i < x-1; i++) {
            int  myIndex = i;
            for (int j = i+1; j < x; j++) {
                if (n[j]<n[myIndex]) {
                    myIndex =j;
                }
            }
            int mainValue = n[myIndex];
            for(int k =myIndex;k>i;k--){
                n[k] = n[k-1];
            }
            n[i]= mainValue;
        }
           }
       
       public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
}
}