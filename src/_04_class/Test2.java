package _04_class;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.printf("원의 반지름은 ? ");
        circle.setR(scan.nextInt());
        System.out.println("원의 반지름 : " + circle.getR());
        circle.calculateArea();
        scan.close();
    }
}
