
class Parent {
    public void add() {
        System.out.println("This is the Parent class.");
    }
}


class Child1 extends Parent {
    public void display1() {
        System.out.println("This is the First Child class.");
    }
}


class Child2 extends Parent {
    public void display2() {
        System.out.println("This is the Second Child class.");
    }
}

public class inherit
 {
    public static void main(String[] args) {
       
        Child1 obj1 = new Child1();
        obj1.add(); 
        obj1.display1();

        
        Child2 obj2 = new Child2();
        obj2.add(); 
        obj2.display2(); 
    }
}
