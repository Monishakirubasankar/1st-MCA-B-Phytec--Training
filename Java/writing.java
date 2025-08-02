
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writing{
    public static void main(String[] args) {
        try {
            FileWriter r = new FileWriter("hi.txt");
            r.write("Hello, World!");
            if (r != null) {
                r.write("\n");
                r.write("My name is Moni and my friend name is vithya.");
                System.out.println("Successfully wrote to the file.");
                r.close();
            } else {
                System.out.println("File not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}