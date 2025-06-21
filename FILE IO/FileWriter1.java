import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("TextFile.txt"); // File Writer to write Charecter data to the file 
        fw.write("Shirisha"); //this line will Write string Content to file
        fw.write("\n"); //this line is used For new Line
        fw.write(100); // This line Write the unicode value of 100 that is d
        fw.write("\n");
        char [] ch = {100,101,102,103};
        fw.write(ch);
        fw.write("Manisha", 3, 3);
        fw.flush(); //this line gives the gruentee that total data including last charcter will be return to the file
        fw.close(); // to close the Writer


    }
}

//The Above fileWriter ment for overriding of existing data