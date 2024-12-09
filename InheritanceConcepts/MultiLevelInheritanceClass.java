class Animal {
    void eat() {
        System.out.println("Eating....");
    }
    void sleep() {
        System.out.println("Sleeping......");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("Dog is Barking.....");
    }

    void run() {
        System.out.println("Dog is Running....");
    }
}

class babyDog extends dog {
    void bark() {
        System.out.println("BabyDog is Yelling...");
    }

    void Train() {
        System.out.println("Baby dog get Tranining from Dog and there Owner");
    }
}

public class MultiLevelInheritanceClass {
    public static void main(String[] args) {
        babyDog bd = new babyDog();
        bd.eat();
        bd.bark();
        bd.sleep();
        bd.Train();
        dog d1=new dog();
        d1.eat();
        d1.bark();
        d1.run();
    }
}
