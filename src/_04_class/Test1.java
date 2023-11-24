package _04_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args){
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        List<Rectangles> rect = new ArrayList<>();

        while(run){
            System.out.println("사각형의 세로와 가로의 값을 받아 넓이를 구하시오");
            Rectangles rect1 = new Rectangles(scan.nextInt(), scan.nextInt());
            if(rect1.getWidth() == 0 && rect1.getHeight() == 0) {
                for(Rectangles texts : rect){
                    System.out.println("width는 : " + texts.getWidth());
                    System.out.println("height는 : " + texts.getHeight());
                    System.out.println("넓이는 : " + (texts.getWidth()* texts.getHeight()));
                    System.out.println("-------------------");
                }
                run = false;
            } else {
                rect.add(rect1);
            }
        }

        System.out.println("------ 인스턴스의 개수는 : " + rect.size());
    }
}
