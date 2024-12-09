
class Animal {
    void eat() {
        System.out.println("Eating.....");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("Barking.....");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        dog d = new dog();
        System.out.println("Single Level Inheritance Example ");
        d.eat();
        d.bark();
    }
}
