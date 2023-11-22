package _03_array;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("5개의 숫자를 입력하세요");
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = scan.nextInt();

        }
        double avg = 0;
        double sum = 0;
        for(double arrs : arr){
            sum += arrs;
            avg = sum/arr.length;
        }
        System.out.println("평균은 : " + avg);
    }
}
