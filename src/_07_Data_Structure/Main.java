package _07_Data_Structure;

import java.util.Scanner;

public class Main{
    public static long pro(long x, long y){
        long temp =0;
        if(x < y){
            temp = x;
            x = y;
            y = temp;
        }

        if(x%y == 0){
            return y;
        } else {
            return pro(x, x%y);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long c = pro(scan.nextLong(),scan.nextLong());
        for(long i=1; i<=c; i++) {
            System.out.print(1);
        }
        scan.close();
    }
}