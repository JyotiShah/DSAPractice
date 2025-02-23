package Inheritance;

public class Calling {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.getName("Jyoti");
        child1.getChild();
        String string = child1.toString();
//        Child1 child2 = new Parent();

        Parent parent = new Parent();
        parent.getName("SeleniumheadQtr");
        Parent parent1 = new Child1();
        parent1.toString();
        parent1.getName("Parent 1 calling");
        String name = parent.Name;
        System.out.println(name.length());
        System.out.println(name.indexOf("h"));
        System.out.println(name.substring(name.indexOf("h"), name.indexOf("Q")));

        String a = "Hello Jyoti Hi Jyoti";
        String b = new String("Hello");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.repeat(2));
        //System.out.println(a.split(" "));
        String[] str = a.split(" ");
        int count = 1;
        for (int i=0; i<str.length; i++){
            for (int j = i+1; j<str.length; j++){
                if (str[i].equals(str[j])){
                    count++;
                     str[j]="0";
                }
            }
            if (count > 1 && str[i] != "0") {
                System.out.println(str[i] +" -count is - " +count);
            }


        }
        //System.out.println(count);


    }
}
