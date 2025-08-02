import java.util.*;

public class arithmatic {
    public static void main(String[] args)
    {
        int add,sub,mul,div;
        Scanner o  = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = o.nextInt();
        System.out.println("Enter second number:");
        int b = o.nextInt();
        add=a+b;
        System.out.println("Addition : " +add);
        sub=a-b;
        System.out.println("Subtraction:" +sub);
        mul=a*b;
        System.out.println("Multiplication" +mul);
        div=a/b;
        System.out.println("Division:" +div);

    }
}
