

public class InsertionSort {
    public static void main(String[] args) {
        int[] Myary = {2,15,20,11,30,44,37,4,3,1};
        int n = Myary.length;
       
        for (int i = 1; i < n; i++) {
            int  CurrentValue = Myary[i];
            int inserIndex =i;
            int j =i-1;
            while (j>= 0 &&Myary[j]>CurrentValue) {
                Myary[j+1]= Myary[j];
                inserIndex=j;
                j--;
            }
            Myary[inserIndex]= CurrentValue;
        }
        System.out.print("Sorted Array :");
        for (int SortedValue : Myary) {
            System.out.print(SortedValue + ",");
        }
        
    }
}
/*  Arrays.sort(Myary);
         for(int i:Myary){
             System.out.print(i+",");}*/