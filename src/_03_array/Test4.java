package _03_array;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("배열의 개수를 입력하세요");
            int[] arr = new int[scan.nextInt()];

            int sum = 0;
            for(int i = 0; i < 6; i++){
                System.out.println("배열의" + (i+1) + "값을 입력해주세요");
                arr[i] = scan.nextInt();
                sum += arr[i];
            }
            System.out.println("합계 값은 : " + sum);
            double avg = sum/0;
            System.out.println("배열의 평균 값은 : " + avg);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스의 범위를 벗어낫습니다");
        } catch(InputMismatchException e){
            System.out.println("인풋 타입 에러가 발생했습니다");
        } catch(NullPointerException e){
            System.out.println("Null 값이 생겼습니다");
        } catch(ArithmeticException e) {
            System.out.println("산술 조건에 어긋납니다");
        }
    }
}
