import java.io.PrintWriter;

public class PrinterWriter1 {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("PrintWriterFile.txt");
        pw.println("PrintWriter is recommanded to write any type of data to file");
        pw.print("This line is executed in same line");
        pw.print(" This line also prints data in same line");
        pw.flush();
        pw.close();
    }

}
