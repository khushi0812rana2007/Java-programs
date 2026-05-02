import java.io.*;
public class FileWrite {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("Hello File Handling");
        fw.close();
        System.out.println("File written successfully");
    }
}
