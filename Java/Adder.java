class Adder1 {
    public void add(int a,int b){
        System.out.println(a+b);
    }


    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Adder{
    public static void main(String[] args){
        Adder1 obj = new Adder1();
        obj.add(10,20);
        obj.add(10,20,30);
    }
}