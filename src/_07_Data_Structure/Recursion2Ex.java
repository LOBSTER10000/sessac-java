package _07_Data_Structure;

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
    public static void main(String[] args){
        System.out.println(팩토리얼(5));
        System.out.println(제곱(4,3));
        System.out.println(피보나치수열(10));
        System.out.println(최대공약수(10,20));
    }
}
