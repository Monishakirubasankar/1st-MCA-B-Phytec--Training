import java.util.*;
public class student 
{
    public static void main(String[] args)
    {
        Scanner o  =new Scanner(System.in);
        System.out.println("enter your full name:");
        String name= o.nextLine();
        System.out.println("Myname is :"+name);
        System.out.println("enter the age");
        int age =o.nextInt();
        System .out.println("my age : "+age);
        
        System.out.println("enter the gpa:");
        float cgpa = o.nextFloat();
        System.out.println("GPA:" +cgpa);
     


    }
}
