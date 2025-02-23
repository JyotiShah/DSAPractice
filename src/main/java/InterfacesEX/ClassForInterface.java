package InterfacesEX;

public class ClassForInterface implements Bhanu{
    public static void main(String[] args) {
        ClassForInterface classForInterface = new ClassForInterface();
        String seema = ClassForInterface.Seema;
        classForInterface.hema();
        classForInterface.jyoti();

    }
    @Override
    public void jyoti() {
        System.out.println(Seema);
        System.out.println("This is class method");
    }

    @Override
    public void hema() {
        System.out.println("This is class method Hema");
    }

    @Override
    public void pmethod() {

    }
}
