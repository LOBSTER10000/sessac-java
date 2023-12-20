package algorism;


import java.util.ArrayList;
import java.util.List;

public class Fibo {
    public static int factorial1(int i){
        if(i<= 0){
            return 0;
        }
        else {
            return factorial1(i -1 ) + i;
        }
    }

    public static int factorial2(int i){
        if(i == 1){
            return 1;
        }
        else {
            return i * factorial2(i-1);
        }
    }

    public static int 최대공약수(int i, int y){
        int c = 0;
        if(i < y){
            c = y;
            y = i;
            i = c;
        }

        if(i%y == 0){
            return y;
        }
        else {
            return 최대공약수(i, i%y);
        }
    }

    public static long 배수합(){
        long sum = 0;
        for(long i = 0; i < 1000; i++){
            if(i%3 == 0 || i %5== 0){
                sum += i;
            }
        }
        return sum;
    }

    public static long 피보나치(long i){
        if(i == 0){
            return 0;
        }
        else if(i == 1){
            return 1;
        }
        else{
            return 피보나치(i-1) + 피보나치(i-2);
        }
    }

    public static boolean 리스트(int a){
        List<Integer> list = new ArrayList<>();
        for(int i =0; i < 10; i++){
            list.add((int)(Math.random() *10) +1);
        }
        
    }
    public static void main(String[] args){
        System.out.println(factorial1(5));
        System.out.println(factorial2(5));
        System.out.println(최대공약수(20,40));
        System.out.println(배수합());
        System.out.println(피보나치(15));


    }
}
