import java.util.*;
public class natural {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner o  =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =o.nextInt();
        
        for(int i=1;i<=n;i++)
        { 
            sum =sum + i; 
        }
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
      
        
    }
}
