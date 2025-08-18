package Assignment1Arrays;

public class Q6 {

    /**
     * remove junk chars
     */

    public static void main(String[] args) {

        String str = "*^*&%&$# djkn(&^skfdsl&*^*%$ sdfsd";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(nextChar("Vijay"));
    }

    public static String nextChar(String str) {
        String replaced = "";
        for(int i=0; i<=str.length()-1; i++){
            char c = (char) (str.charAt(i)+1);
            replaced = replaced + c;
        }
        return replaced;
    }

}
