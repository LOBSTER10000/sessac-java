package _02_control_statement;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 두개를 입력하세요");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        System.out.println("덧셈 결과 " + (number1 + number2));
        System.out.println("뺄셈 결과 " + (number1 - number2));
        System.out.println("나눗셈 결과 " + (number1 / number2));
        System.out.println("곱셈 결과 " + (number1 * number2));
    }
}
