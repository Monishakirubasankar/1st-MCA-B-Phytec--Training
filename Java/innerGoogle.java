abstract class Google {
   abstract void display();
   void search(){
    System .out.println("searching");
   } 
}
class searchAll extends Google{
    void display()
    {
        System.out.println("all search result");
    }
}
class searchVideo extends Google{
    void display()
    {
        System.out.println("All search video");
    }
}
class Main{
    public static void main(String[] args){
        searchAll a = new searchAll();
        searchVideo b = new searchVideo();
        a.search();
        a.display();
        b.search();
        b.display();
    }
}