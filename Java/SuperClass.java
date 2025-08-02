class SuperClass1 {
    void methodsuper()
    {
        System.out.println("I'm super class");
    }
}
class SubClass extends SuperClass1{
    void methodsub()
    {
        System.out.println("I'm sub class");
    }
}
public class SuperClass{
        public static void main(String[] args){
            SubClass obj = new SubClass();
            obj.methodsuper();
            obj.methodsub();
        }
    }