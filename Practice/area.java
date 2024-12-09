public class area {
    void fun1() {
        int length = 4;
        int width = 6;
        int area;

        area = length * width;
        System.out.println("The length is : "+length);
        System.out.println("The Width is : "+width);
        System.out.println("The Area of Rectangle : " + area);
    }

    public static void main(String[] args) {
        area a = new area();
        a.fun1();
    }
}
