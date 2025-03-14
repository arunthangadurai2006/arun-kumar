
class Parent {
    public void add() {
        System.out.println("HELLO WORLD");
    }
}
class Third extends Parent {
    void helper() {
        add(); 
    }
}
public class brek {
    public static void main(String[] args) {
        int i = 0;
       
        while (i < 11) {
            if (i % 2 == 0) { 
                if (i > 5) {
                    break;
                }
                System.out.println(i);
            }
            i = i + 1; 
        }
    }
}
