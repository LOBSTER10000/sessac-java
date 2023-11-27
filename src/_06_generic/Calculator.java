package _06_generic;

public class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(){
        super();
    }

    public Calculator(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args){
        Calculator<Integer> c1 = new Calculator<>();
        c1.setNum1(10);
        c1.setNum2(5);
        System.out.println("Integer Sum : " + c1.add());

        Calculator<Double> c2 = new Calculator<>(5.14, 0.5);
        System.out.println("Double sum : " + c2.add());
    }
}