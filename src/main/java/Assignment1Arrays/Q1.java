package Assignment1Arrays;

public class Q1 {
    public static void main(String[] args){
        int[] arr =  {2,7,11,15};
        int targetSum = 9;
        solution(arr, targetSum);

    }

    /**
     * 💡 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * @param nums
     * @param targetSum
     * @return
     */
    public static int[] solution(int[] nums, int targetSum){
        int[] tempArr = new int[2];

        for (int i=0; i< nums.length; i++){
            for (int j = 1; j< (nums.length) ; j++){

                if(nums[i] +nums[j] == targetSum){
                    tempArr[0]=i;
                    tempArr[1]=j;

                }
            }
        }
        System.out.println(tempArr[0] + tempArr[1]);
        return tempArr;
    }
}
