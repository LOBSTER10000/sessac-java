package _07_Data_Structure;

import java.util.Scanner;

public class Recursion2Ex {
    public static int 팩토리얼(int n ){
        if(n == 1){
            return 1;
        } else {
            return n * 팩토리얼(n-1);
        }
    }

    public static int 제곱(int x, int y){
        if(y == 0){
            return 1;
        } else {
            return x * 제곱(x, y-1);
        }
    }

    public static int 피보나치수열(int x){
        if(x <=2){
            return 1;
        } else {
            return 피보나치수열(x-1) + 피보나치수열(x-2);
        }
    }

    public static int 최대공약수(int x, int y){
        int temp = 0;
        if(y > x){
            temp = x;
            x = y;
            y = temp;
        }

        if(x%y == 0){
           return  y;
        } else {
            return 최대공약수(x, x%y);
        }
    }

    public static void 반대로출력(String n){
        if(n.length() == 0){
            return;
        }
        else {
            System.out.print(n.charAt(0));
            반대로출력(n.substring(1));
            System.out.print(n.charAt(0));
        }
    }

    public static void 이진법(int n){
        if(n < 2){
            System.out.print(n);
        } else {
            이진법(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args){
        System.out.println(팩토리얼(5));
        System.out.println(제곱(4,3));
        System.out.println(피보나치수열(10));
        System.out.println(최대공약수(10,20));
        반대로출력("안녕하세요 여러분");
        이진법(10);

        Scanner scan = new Scanner(System.in);
        long a =0;
        long b =0;
        a = scan.nextLong();
        b = scan.nextLong();
        long temp = 0;
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        long c = 0;
        long d = 0;
        boolean run =true;
        while(run){
            if(a%b == 0){
                c = b;

                run = false;
            } else {
                b = a%b;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < c; i++) {
            sb.append(1);
        }

        System.out.println(sb);
        scan.close();

    }
}
