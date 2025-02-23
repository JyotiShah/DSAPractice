package Assignment1Arrays;

public class Q2 {
    public static void main(String[] args){
        int a = 10, b = 20;
        if(!(a > 10 && b > 20))
            System.out.println(a+" "+b+" ");
        System.out.println(a+" "+b);
    }

    public void arrays(){
        char[] arr = new char[]{'a', 'b','c'};
        try {
            System.out.println(arr.length);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
