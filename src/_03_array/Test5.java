package _03_array;



import java.util.*;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("배열의 크기를 입력하십시오 : ");
            int size1 = scan.nextInt();
            List<Integer> arr1 = new ArrayList<>(size1);

            System.out.println("배열의 요소를 입력하십시오 : ");
            for(int i =0; i <size1; i++){
                arr1.add(scan.nextInt());
            }

            Map<Integer, List<Integer>> arr2 = arr1.stream().collect(Collectors.groupingBy(Integer::intValue));
            for(List<Integer> arr3 : arr2.values()){
                if(arr3.size() > 1){
                    System.out.println(arr3);
                }
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스의 범위를 벗어남");
        } catch(NegativeArraySizeException e) {
            System.out.println("배열의 개수에 음수를 입력할 수 없습니다");
        } catch(InputMismatchException e) {
            System.out.println("정수가 아닌 다른 값을 입력할 수 없습니다");
        } catch(NullPointerException e){
            System.out.println("Null값이 입력될 수 없습니다");
        }

    }

}
