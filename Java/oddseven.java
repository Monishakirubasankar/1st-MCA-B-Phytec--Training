import java.util.*;
public class oddseven {
    public static void main(String[] args){
    Scanner s  =new Scanner(System.in);
    System.out.print("Enter the number:");
        int num =s.nextInt();
        System.out.print("The number is "+num);
        if (num%2 == 0){
         System.out.println("even number");
        }else
         {
            System.out.println("odd number");
         }
        }
}
