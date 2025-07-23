

public class ReversString {
    public static void main(String[] args) {
        String s = "Shirisha";
        String reversed = "";
        for(int i=0;i<s.length();i++){
         reversed = s.charAt(i)+reversed;
        }
        System.out.println(reversed);
    }
}
