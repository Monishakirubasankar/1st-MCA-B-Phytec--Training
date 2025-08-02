/*import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
    public static void main(String[] args) {
       try {
             
            FileWriter r = new FileWriter("hi.txt");
            r.write("Hello Moni");
            r.close();
            System.out.println("File written successfully");
        } 
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("hi.txt");
             FileWriter writer = new FileWriter("hello.txt")) {

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data); 
            }

            System.out.println("Content copied successfully from source.txt to destination.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
