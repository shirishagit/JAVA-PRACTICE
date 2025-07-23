public class Bubbleup {
    public static void main(String[] args) {
        int[]  arr = {6,2,8,9,5,3,1};
        int n = arr.length;
        for (int i=0;i<n-1 ;i++) {
            boolean swepped = false;
            for (int j = 0; j <n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swepped) {
                break;
            }
        }
        System.out.print("Sorted array: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + ",");
    }
   
    }