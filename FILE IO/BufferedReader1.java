import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("TextFile.txt");
        BufferedReader bf = new BufferedReader(f);
        String line = bf.readLine();
        while (line !=null) {
            System.out.println(line);
            line = bf.readLine();
        }
        bf.close();
    }
}
