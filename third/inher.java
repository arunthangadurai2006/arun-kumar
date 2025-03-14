class Parent {
    public void add() {
        System.out.println("HELLO WORLD");
    }
}


class Child extends Parent {
    void display() {
        add(); 
    }
}


class Third extends Parent {
    void helper() {
        add(); 
    }
}


public class inher {
    public static void main(String[] args) {
       Third obj1 = new Third();
        obj1.helper();
        Child obj2 = new Child();
        obj2.display();
    }
}