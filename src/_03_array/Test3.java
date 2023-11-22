package _03_array;

public class Test3 {
    public static void main(String[] args){
        try{
            int[] arr = {1,2,3,4};

            for(int i = 0; i < 5; i++){
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스의 범위를 넘어갔습니다.");
        } finally {
            System.out.println("연산을 종료합니다.");
        }
    }

}
