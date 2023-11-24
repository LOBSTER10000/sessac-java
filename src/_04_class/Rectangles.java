package _04_class;

import java.util.Scanner;

public class Rectangles {
    private int width, height;

    public Rectangles(){
        super();
    }

    public Rectangles(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void area(){
        System.out.println("사각형의 길이를 세로와 가로로 띄어 쓰기 기준으로 입력하세요");
        Scanner scan = new Scanner(System.in);

        setWidth(scan.nextInt());
        setHeight(scan.nextInt());

        System.out.println("가로는 : " + getWidth());
        System.out.println("세로는 : " + getHeight());
        System.out.println("넓이는 : " + (width*height));
    }
}
