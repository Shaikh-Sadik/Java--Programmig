import java.util.Scanner;
public class SwitchClass {
    public static void main(String[] args) {
        String ch;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Character");
        ch=s1.next();
        switch (ch) {
            case "a" :
            System.out.println("Jan");
                break;
                case "b" :
                System.out.println("Feb");
                    break;
                    case "c" :
            System.out.println("March");
                break;
                case "d" :
            System.out.println("April");
                break;
            default:
                break;
        }
        s1.close();

    }
}
