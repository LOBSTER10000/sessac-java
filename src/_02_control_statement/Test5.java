package _02_control_statement;

public class Test5 {
    int a,b,e,r;

    public Test5(){
        super();
    }
    public Test5(int a, int b, int e, int r){
        this.a = a;
        this.b = b;
        this.e = e;
        this.r = r;
    }
    public static void main(String[] args){
        Test5 t5 = new Test5();
        t5.result(5);
        t5.result(4,7);
        t5.result(6,3,2);

    }

    public void result(int r){
        System.out.println("원의 넓이");
        double r1 = r;
        System.out.println("반지름이 " + r +"인 원의 넓이는 : " + (Math.PI * (r1*r1)) );
    }

    public void result(int a, int b){
        System.out.println("직사각형의 넓이");
        double c = a;
        double d = b;
        System.out.println("가로 " + a +"cm와 세로 " + b +"cm인 직사각형의 넓이는 : " + (c*d));
    }

    public void result(int a, int b, int e){
        System.out.println("삼각형의 넓이");
        double c1 = a;
        double d1 = b;
        double e1 = e;
        System.out.println("밑변 " + a + "cm, 높이 " + b + "의 삼각형의 넓이는 :" + (c1*d1/e1));
    }
}
