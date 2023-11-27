package _05_test;

public class Airplane extends Vehicle implements Flyable{

    @Override
    public void move() {
        System.out.println("하늘을 나는 중");;
    }

    @Override
    public void fly(){
        System.out.println("고도 10,000피트에서 나는 중");
    }
}
