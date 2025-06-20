import java.io.FileWriter;
import java.io.IOException;

public class File2 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("TextFile.txt");
        fw.write("Shirisha");
        fw.write("\n");
        fw.write(100);
        fw.flush();
        fw.close();


    }
}