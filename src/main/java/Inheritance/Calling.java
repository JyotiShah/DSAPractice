package Inheritance;

public class Calling {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.getName("Jyoti");
        String string = child1.toString();
        Child1 child2 = new Child1();

        Parent parent = new Parent();
        parent.getName("Jyo hjhadh");
        Parent parent1 = new Child1();
        parent1.getName("Parent 1 calling");
        String name = parent.Name;
        System.out.println(name.length());
        System.out.println(name.indexOf("h"));
        System.out.println(name.substring(name.indexOf("h"), name.indexOf("d")));


    }
}
