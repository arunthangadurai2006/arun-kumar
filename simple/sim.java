class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Hello from Child");
    }
}

public class sim {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.display();
    }
}
