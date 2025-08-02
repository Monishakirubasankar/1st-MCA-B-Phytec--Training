import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Reading {
    public static void main(String[] args){
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
             FileWriter f = new FileWriter("hi.txt")) {
            String line;
            System.out.println("Enter text (type 'exit' to stop):");
            while ((line = r.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if the user types "exit"
                }
                f.write(line + "\n"); // Write the line to the file
            }
            System.out.println("Content written to hi.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}