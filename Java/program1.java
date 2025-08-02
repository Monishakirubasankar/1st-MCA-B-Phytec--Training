class Program {
   
    private String name;
    private int age;
    
    // 1. Constructors
    public Program() { 
        name = "Unknown";
        age = 0;
    }
    
    public Program(String name, int age) { 
        this.name = name;
        this.age = age;
    }
    
    // 2. Methods

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

public class program1 {
    public static void main(String[] args) {
    
        Program student1 = new Program(); 
        Program student2 = new Program("Alice", 20);
        
        student1.displayInfo();
        student2.displayInfo();
        
        student1.setName("Bob");
        student1.setAge(22);
        
        System.out.println("\nAfter update:");
        student1.displayInfo();
    }
}