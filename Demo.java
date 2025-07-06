public class Demo {

    public static String stringRevers(String str){
         String result = "";
         for(int i = str.length()-1 ; i>=0; i--)
            result +=str.charAt(i);
          
         
           return result;
    }
    public static void main(String[] args) {
        String a = "Shirisha";
         String w = stringRevers(a);
       System.out.println(w); 
    }
}