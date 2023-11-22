package _02_control_statement;

public class MethodOverloading {

    public static void main(String[] args){

        MethodOverloading ol = new MethodOverloading();

        System.out.println(ol.add(1,2));
        System.out.println(ol.add(10.0, 20.8));
        System.out.println(ol.add(1,4,6));
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
