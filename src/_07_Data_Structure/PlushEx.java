package _07_Data_Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlushEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(a.length());
        if(1 <= a.length() && a.length() >= 1000000){
            System.out.print(a);
        }
    }
}
