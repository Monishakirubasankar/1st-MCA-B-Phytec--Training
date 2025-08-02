import java.io.FileInputStream;
import java.io.IOException;
public class reading{
public static void main(String[] args) {
    try (FileInputStream obj = new FileInputStream("hello.txt")) {
        int data;
        while ((data = obj.read()) != -1) {
            System.out.print((char)data + " --- "+ data + "\n");
        }
    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}
}