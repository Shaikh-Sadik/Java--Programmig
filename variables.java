class variables {

    String name;
    int age;
    float salary;
    char ch;
    boolean bool;


    void fun1 ()
    {
         name = "Rajvir";
         age = 25;
         salary = 2000.25f;
         ch = 'k';
         bool = true;

    }
    
    void display()
    {
        fun1();
        System.out.println("The Name is : " +name);
        System.out.println("The Age is : "+age);
        System.out.println("The Salary is : "+salary);
        System.out.println("The Letter is : "+ch);
        System.out.println("The boolean value is : "+bool);

    }

    public static void main(String[] args) {
        variables v = new variables();
        // v.fun1();
        v.display();
    }
}
