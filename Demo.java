public class Demo {
    
    public static void main(String[] args) {
         String original = "madam";
        String s = new StringBuffer().reverse().toString();
          if (s.equals(original)) {
            System.out.println(original + " Is not Palindrome");
          }else {
            System.out.println(original + " Is Palindrome");
          }

    }
    
   
    
}