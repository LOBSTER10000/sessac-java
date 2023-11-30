package _06_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args){
        Set<Integer> h1 = new HashSet<>();
        Boolean run = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력하세요 -1을 입력하면 종료합니다");
        while(run){
            int num1;
            System.out.printf("정수 입력 : ");
            num1 = scan.nextInt();
            if(num1 == -1){
                run = false;
            }
            else {
                h1.add(num1);
            }
        }

        System.out.println("중복 제거된 정수 목록 : " + h1);
    }
}
