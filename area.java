public class area {
    void fun1() {
        int length = 4;
        int width = 6;
        int area;

        area = length * width;
        System.out.println("The Area is : " + area);
    }

    public static void main(String[] args) {
        area a = new area();
        a.fun1();
    }
}
