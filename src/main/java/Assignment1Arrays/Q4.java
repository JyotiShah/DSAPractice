package Assignment1Arrays;

public class Q4 {
    /**
     * Reverse a string
     */
    public static void main(String[] args) {
        revString("Jyoti Shah");
        revBuff("Aditi Vijay");
    }
    public static void revString(String str){
        int len = str.length();
        String rev = "";
        for(int i=len -1 ; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void revBuff(String str){
        StringBuffer rev = new StringBuffer(str).reverse();
        System.out.println(rev);
    }
}
