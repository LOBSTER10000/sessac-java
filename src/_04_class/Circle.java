package _04_class;



public class Circle {

    private static final double PI = Math.PI;
    private int r;

    public Circle(){
        super();
    }

    public Circle(int r){
        this.r = r;
    }

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }

    public void calculateArea(){
        System.out.println("원의 넓이는 : " + (getR()*getR()*PI));
    }
}
