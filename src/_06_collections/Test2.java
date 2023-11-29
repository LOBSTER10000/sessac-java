package _06_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요. 종료를 입력하면 종료됩니다");
        while(run){
            String name;
            int age;
            System.out.println("이름 : ");
            name = scan.next();

            if(name.equals("종료")){
                System.out.println("종료합니다");
                run = false;
            } else {
                System.out.println("나이 : ");
                age = scan.nextInt();
                if(map.containsKey(name)){
                    map.replace(name,age);
                }
                else {
                    map.put(name,age);
                }
            }
        }

        map.forEach((k,v)->{
            System.out.println("이름 : " + k + ", 나이 : " + v);
        });

    }
}
