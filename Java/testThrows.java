import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class testThrows {
   static void findfile()throws FileNotFoundException{
    FileInputStream f= new FileInputStream("hello.txt");
   } 
  public static void main(String[] args)
  {
    try{
        findfile();
    }
    catch(FileNotFoundException e){
        System.out.println("error");
  } 
System.out.println("Rest of the code");
 }
}


