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
            System.out.println("나이 : ");
            age = scan.nextInt();
            if(name == "종료"){
                System.out.println("종료합니다");
                run = false;
            }
            else if (map.containsKey(name)){
                System.out.println("중복되는 값이 있습니다");
                map.replace(name, age);
            }
            else {
                System.out.println("저장합니다");
                map.put(name,age);
            }
        }

        System.out.println(map);
    }
}
