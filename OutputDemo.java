import java.io.FileNotFoundException;
import java.io.PrintStream;

public class OutputDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream a = new PrintStream("F:\\RDEC-JAVA-2027\\SEC-E\\temp.txt");
        a.print("This is without system class");
    }
}
