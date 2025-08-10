package Assignment1Arrays;

public class Q5 {
    /**
     * Reverse a sentence
     */
    public static void main(String[] args) {
        revSentence("Aditi Malekar");
        revSentence("Bade Papa");
        revSentence("Kirtikumar Shah");
    }
    public static void revSentence(String Sentence){
        String[] indStr = Sentence.split(" ");
        String rev = "";
        for(int i=indStr.length-1; i>=0; i--){
            rev = rev + indStr[i];
        }
        System.out.println(rev);
    }
}
