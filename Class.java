class Class {
    private int x;
    private int y;
    static int c;

    void fun1() {
        x = 10;
        y = 20;
        c=99;
    }

    void fun2() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
    }
    void fun3 ()
    {
        c=45;
    }

    public static void main(String[] sadik) {
        Class c1 = new Class();
        Class c2 = new Class();
        c1.fun2();
        c1.fun1();
        c1.fun2();
        c2.fun3();
        c2.fun2();

    }
}