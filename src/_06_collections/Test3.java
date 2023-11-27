package _06_collections;

public class Test3 {
    public static int sumLessThan(int[] num1, int num2){
        int sum = 0;
        for(int n:num1){
            if(n<num2){
                sum+=n;
            }
        }
        return sum;

    }
    public static void main(String[] args){

        int[] nums1 = {2,5,8,3,7};

        System.out.println(sumLessThan(nums1, 7));
    }
}
