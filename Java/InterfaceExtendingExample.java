interface Animal{
     void eat();
}
interface Bird extends Animal{
     void fly();
}
class sparrow implements Bird{
    public void eat()
    {
        System.out.println("Sparrow is eating");
    }
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
public class InterfaceExtendingExample{
    public static void main(String[] args){
        sparrow sparrow = new sparrow();
        sparrow.eat();
        sparrow.fly();
    }
}



