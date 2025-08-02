import java.util.*;
public class string
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
            // Taking input from the user
            System.out.println("Enter first string:");
            String input = scanner.nextLine();

            //Count the vowels
            int count = 0;
        

            for (int i = 0; i < input.length(); i++) 
            {
                char ch = input.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    count++;
                }
            }
            System.out.println("Number of vowels in the string: " + count);
        
            
            // Reverse the string
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversed);
           
            
            //lower to upper case
            String upper = input.toUpperCase();
            System.out.println("Uppercase string: " + upper);

            //upper to lower case
            String lower = input.toLowerCase();          
            System.out.println("Lowercase string: " + lower);
            
        
    }
}