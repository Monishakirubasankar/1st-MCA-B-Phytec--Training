import java.util.*;

public class builtin {
    public void cal() { 
        int a, b; 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number: "); 
        a = scanner.nextInt(); 
        b = a * a; 
        System.out.println("Square of the number: " + b); 
        scanner.close(); 
    }
}

class builtin1 {
    public static void main(String args[]) {
        builtin obj = new builtin();
        obj.cal();
    }
}