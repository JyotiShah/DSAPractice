package Inheritance;

import java.util.Objects;

public class Parent {

    String Name;
    int ID;

    public void getName(String Name){
        this.Name = Name;
        System.out.println("Parent getName");
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Parent equals");
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return ID == parent.ID && Objects.equals(Name, parent.Name);
    }

//    @Override
//    public int hashCode() {
//        System.out.println("Parent hashCode");
//        return Objects.hash(Name, ID);
//    }

//    @Override
//    public String toString() {
//        System.out.println("Parent toString");
//        return super.toString();
//    }
}
