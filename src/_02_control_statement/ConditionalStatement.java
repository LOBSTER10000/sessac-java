package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){

        //if ~ else 문
        int number = 10;

        if(number % 2 == 0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // String 객체 비교
        System.out.println("이름을 입력해주세요");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("name 값 확인 " + name);


        if(name == "김새싹"){
            System.out.println("환영합니다");
        } else {
            System.out.println("다시 입력해주세요");
        }
    }
}
