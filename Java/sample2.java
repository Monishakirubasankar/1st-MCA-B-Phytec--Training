import java.util.Stack;
public class sample2 {
    public static void main(String[] agrs)
    {
        Stack<String> s = new Stack <>();
        s.push("moni");
        s.push("vithya");
        s.push("praba");
        s.push("tharun");
        s.push("siva");
        System.out.println("Stack: " + s);
        System.out.println("The element at top of the stack : " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("updated stack: " + s);
    }
}
