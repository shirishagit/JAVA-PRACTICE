import java.util.regex.*;

public class RegEx1 {
    public static void main(String[] args) {
        int count = 0;
        Pattern p =  Pattern.compile("4");
        Matcher m = p.matcher("9441933042");
        while(m.find()){
            count++;
            System.out.println(m.start() + "..." + m.end());
        }
        System.out.println("The count is :" + count);
    }
}
