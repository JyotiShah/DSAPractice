package TwoPointers;

import java.util.HashSet;

public class RemoveDulplicatesReturnNewArrayInSameOrder {

    /*
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=two-pointers
     */

    private static int RemoveDulplicatesReturnNewArrayInSameOrder(int[] num){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n: num){
            hashSet.add(n);
        }
        int i=0;
        for (int hs : hashSet){
            num[i] = hs;
            System.out.println(num[i]);
        }
        return hashSet.size();
    }

    public static void main(String[] args) {

        System.out.println(RemoveDulplicatesReturnNewArrayInSameOrder(new int[] {11, 11, 12, 13, 13, 14}));
    }
}
