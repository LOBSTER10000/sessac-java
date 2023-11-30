package _07_Data_Structure;

public class RecursionEx {
    public static void 재귀함수(int i){
        if(i <= 0){
            return;
        } else {
            System.out.println(i);
            재귀함수(i-1);
        }
    };

    public static int 합수(int d){
        if(d == 0){
            return 0;
        } else {
            return d + 합수(d-1);
        }
    }

    public static int 팩토리얼(int i){
        if(i <= 1){
            return 1;
        } else {
            return i * 팩토리얼(i-1);
        }
    }

    public static int 제곱(int x, int y){
        if(y == 0){
            return  1;
        } else {
            return x * 제곱(x, y-1);
        }
    }

    public static int 피보나치(int x){
        if(x <2){
            return x;
        } else {
            return 피보나치(x-1) + 피보나치(x-2);
        }
    }

    public static int 최대공약수(int x, int y){
        if(x%y == 0){
            return y;
        } else {
            return 최대공약수(x, x%y);
        }
    }

    public static int 최소공배수(int x, int y){
           int z = 최대공약수(x,y);
           return z * (x/z) * (y/z);
    }
    public static void main(String[] args){
        재귀함수(5);
        System.out.println(합수(5));
        System.out.println(팩토리얼(5));
        System.out.println(제곱(5,3));
        System.out.println(피보나치(10));
        System.out.println(최대공약수(20,12));
        System.out.println(최소공배수(10,6));
    }
}
