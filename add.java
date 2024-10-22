public class add {
    void display ()
    {
        System.out.println("Addition OF Two Numbers");
        System.out.println("First Number is "+5);
        System.out.println("Second Number is "+10);
        System.out.print("The Addition is : ");
        System.out.println(5+10);
    }
    
    public static void main(String[] args) {
        add addition = new add();
        addition.display();
    }
}
