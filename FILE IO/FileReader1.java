import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
   public static void main(String[] args) throws IOException{
     FileReader fw = new FileReader("TextFile.txt");
      int i = fw.read();
      while (i !=-1) {
        System.out.println((char)i  );
        i = fw.read();
      } 
      fw.close();
      
   } 
}
