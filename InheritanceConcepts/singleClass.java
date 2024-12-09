class Employee {
    float salary = 40000;
}

public class singleClass extends Employee {
    int bonus = 1000;

    public static void main(String[] args) {
        singleClass s1 = new singleClass();
        System.out.println("The Salary of Programmer is : " + s1.salary);
        System.out.println("The Bonus of Programmer is : " + s1.bonus);
    }

}