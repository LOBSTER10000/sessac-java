package algorism;

public class CodingOn1 {
    public static int sumLessThan(int[] nums1, int a){
        int sum = 0;
        for(int i =0; i< nums1.length; i++){
            if(nums1[i] < a){
                sum += nums1[i];
            }
        }
        return sum;
    }

    public static int[] findIndices(int[] nums2, int target){
        int[] result = new int[2];
        for(int i =0; i< nums2.length; i++){
           for(int j= 1; j < nums2.length; j++){
               if(nums2[i] + nums2[j] == target){
                   result[0] = j;
                   result[1] = i;
                   break;
               }
           }
        }
        return result;
    }

    public static int search(int[] nums, int target){
        int result = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] == target){
                result = i ;
            }
        }
        return result;
    }

    public static int gdc(int x, int y){
        int tmp = 0;
        if(x < y){
            tmp = x;
            x = y;
            y = tmp;
        }

        if(x%y == 0){
            return y;
        }
        else {
            return gdc(x, x%y);
        }
    }

    public static int factorial(int x){
        if (x == 0) {
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
    public static void main(String[] args){
        int[] nums1 = {2,5,8,3,7};
        System.out.println(sumLessThan(nums1, 5));

        int[] nums2= {3,2,5,7,11};
        int target2 = 9;
        int[] result2 = findIndices(nums2, target2);
        System.out.println(result2[0] + " " + result2[1]);

        int[] nums = {3,4,5,6,7,8,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));

        System.out.println(gdc(10,20));
        System.out.println(factorial(3));
    }
}
