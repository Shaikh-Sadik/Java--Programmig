import java.util.Scanner;

public class AreaCalculator {

    double r, l, b, h, A;
    final double pi = 3.14;

    void areaOfCircle(Scanner scanner) {
        System.out.println("Enter The Radius Of Circle : ");
        r = scanner.nextDouble();
        A = pi * r * r;
        System.out.println("The Area of Circle is : " + A);
        display();
    }

    void areaOfRectangle(Scanner scanner) {
        System.out.println("Enter The Length Of Rectangle : ");
        l = scanner.nextDouble();
        System.out.println("Enter The Breadth Of Rectangle : ");
        b = scanner.nextDouble();
        A = l * b;
        System.out.println("The Area of Rectangle is : " + A);
        display();
    }

    void areaOfTriangle(Scanner scanner) {
        System.out.println("Enter The Breadth Of Triangle : ");
        b = scanner.nextDouble();
        System.out.println("Enter The Height Of Triangle : ");
        h = scanner.nextDouble();
        A = 0.5 * b * h;
        System.out.println("The Area of Triangle is : " + A);
        display();
    }

    void areaOfCylinder(Scanner scanner) {
        System.out.println("Enter The Radius Of Cylinder : ");
        r = scanner.nextDouble();
        System.out.println("Enter The Height Of Cylinder : ");
        h = scanner.nextDouble();
        A = 2 * pi * r * (r + h);
        System.out.println("The Area of Cylinder is : " + A);
        display();
    }

    void areaOfSphere(Scanner scanner) {
        System.out.println("Enter The Radius Of Sphere : ");
        r = scanner.nextDouble();
        A = 4 * pi * r * r;
        System.out.println("The Area of Sphere is : " + A);
        display();
    }

    void display() {

        int choise;
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter The Following Option");
        System.out.println("Area of Circle :- 1");
        System.out.println("Area of Rectangle :- 2");
        System.out.println("Area of Triangle :- 3");
        System.out.println("Area of Cylinder :- 4");
        System.out.println("Area of Sphere :- 5");
        System.out.println("Exit :- 6");
        choise = scanner.nextInt();
        switch (choise) {
            case 1:
                areaOfCircle(scanner);
                break;
            case 2:
                areaOfRectangle(scanner);
                break;
            case 3:
                areaOfTriangle(scanner);
                break;
            case 4:
                areaOfCylinder(scanner);
                break;
            case 5:
                areaOfSphere(scanner);
                break;

            default:
                break;
        }
        scanner.close();

    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.display();
    }
}