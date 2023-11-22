package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args){
        ArrayList<String> arr1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.println("문자를 입력하세요");
            String texts = scan.nextLine();
            if(texts.equals("exit")){
                run= false;
            }
            else if(!texts.equals("exit")){
                arr1.add(texts);
            }
        }

        for(String arr : arr1){
            System.out.println(arr);
        }
    }
}
