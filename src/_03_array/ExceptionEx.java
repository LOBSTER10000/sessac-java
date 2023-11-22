package _03_array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

    public static String divide(int x, int y){
        return x + " / " + y + " = " + (x/y);
    }

    public static int getLength(String str){
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx){
        return arr[idx];
    }

    public static void main(String[] args){
        // case1.
        System.out.println(divide(6,2));
//        System.out.println(divide(6,0)); //error 예외 발생 코드
        
        // case2. 예외 처리 코드
        try{
            System.out.println("연산을 시작합니다");
            System.out.println(divide(6,0));
        } catch(ArithmeticException e){
//            System.out.println("나누기 중 에러가 발생함 : " + e.getMessage()); // 예외가 생긴 발생 이유를 보여줌
//            System.out.println(e.toString()); // 예외 종류 리턴
            e.printStackTrace(); // 예외가 어디서 발생했는지 추적
        } finally {
            System.out.println("연산지 종료되었습니다");
        }

        // case3. 예외 발생 코드
        int[] numbers = {10,20,30,40,50};
        System.out.println(getValueByIdx(numbers, 1));

        try{
            System.out.println(getValueByIdx(numbers, numbers.length));
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱싱 중 에러 발생 >> " + e.toString());
        }

        // case4.
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("정수를 입력하세요");
            int number = scan.nextInt();
            System.out.println("입력한 정수 : " + number);
        } catch(InputMismatchException e){
            System.out.println("타입에러 발생 : " + e.toString());
        }
    }
}
