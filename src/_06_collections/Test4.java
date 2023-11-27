package _06_collections;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static int[] findIndices(int[] nums2, int target){
        int c = 0;
        int[] number = new int[2];

        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2.length; j++){
               c = nums2[i] + nums2[j];
               if(target == c){
                    number[0] = j;
                    number[1] = i;
               }
            }
        }


        return number;
    }
    public static void main(String[] args){
        int[] nums2 = {3,2,5,7,11};
        int target2 = 9;
        int[] result2 = findIndices(nums2, target2);
        System.out.println(result2[0] + " : " + result2[1]);
    }
}
