package Inheritance;

public class Child1 extends Parent{

    @Override
    public String toString() {
        System.out.println("Child 1 toString");
        return super.toString();
    }
    public void getChild(){
        System.out.println("I am child");
    }
}
