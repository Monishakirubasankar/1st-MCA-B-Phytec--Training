class parent {
    void display() {
        System.out.println("I'm Parent class method");
    }
}
class child extends parent{
    void display1() {
        System.out.println("I'm child class method");
    }
}
public class overriding {
    public static void main(String[] args) {
        parent obj = new parent();
        child obj1 = new child();
        obj.display();
        obj1.display1();
    }
}
