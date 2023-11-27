package _06_collections;

public class Test5 {

    public static int search(int[] nums, int target){
        int c = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] == target){
                c = i;
            }
        }
        return c;
    }
    public static void main(String[] args){
        int[] nums = {3,4,5,6,7,8,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
