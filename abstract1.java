abstract class Sadik {
    int x, y;

    abstract void f1();

    Sadik() {
        System.out.println("You Succeed ");
    }
}

class Sadik2 extends Sadik {
    void f1() {
        super.x = 10;
        // x=20;
    }

    void displya() {
        System.out.println("x = " + x);
    }

    Sadik2() {
        System.out.println("Done");
    }
}

class abstract1 {
    public static void main(String[] args) {
        Sadik2 s2 = new Sadik2();
        s2.f1();
        s2.displya();
    }
}