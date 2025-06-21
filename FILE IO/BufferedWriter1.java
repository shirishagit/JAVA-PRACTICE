import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

    public static void main(String[] args) throws IOException {
          FileWriter f = new FileWriter("BufferedWriter.txt");
       
        BufferedWriter bf = new BufferedWriter(f); //BufferedWriter 
        bf.write(97);
        bf.newLine();
        bf.write(98);
        bf.newLine();
        bf.write("BufferedWriter File");
        bf.flush();
        bf.close();
    }
}