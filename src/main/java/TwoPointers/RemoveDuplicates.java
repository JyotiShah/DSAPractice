package TwoPointers;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    /* remove duplicates from an array - -
     */

    public static void removeDuplicates(int[] num){

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : num){
            hashSet.add(i);
        }

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args){
        removeDuplicates(new int[]{1, 2, 3, 4, 4, 5, 5, 6, 6, 6});
    }
}
