public class variables {
    void fun1 ()
    {
        String name = "Rajvir";
        int age = 25;
        float salary = 2000.25f;
        char ch = 'k';
        boolean bool = true;

        System.out.println("The Name is : " +name);
        System.out.println("The Age is : "+age);
        System.out.println("The Salary is : "+salary);
        System.out.println("The Letter is : "+ch);
        System.out.println("The boolean value is : "+bool);
    }

    

    public static void main(String[] args) {
        variables v = new variables();
        v.fun1();
    }
}
