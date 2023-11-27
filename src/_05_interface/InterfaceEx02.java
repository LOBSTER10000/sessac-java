package _05_interface;

// 움직임에 대한 인터페이스
interface Move{
    void moveForward();
    void moveBackword();
}

// 전원에 대한 인터페이스
interface Power{
    void powerOn();
    void powerOff();
}

//인터페이스는 인터페이스를 상속받을 수 있음
// - extends 키워드 사용
// - 인터페이스는 다중 상속 가능
interface  Car extends Move, Power{
  void changeGear(int gear);  
}

class Suv implements Car {

    @Override
    public void moveForward() {
        System.out.println("전진");
    }

    @Override
    public void moveBackword() {
        System.out.println("후진");
    }

    @Override
    public void powerOn() {
        System.out.println("시동 켜짐");
    }

    @Override
    public void powerOff() {
        System.out.println("시동 꺼짐");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("기어를 " + gear + "단으로 변경합니다");
    }
}
public class InterfaceEx02 {
    
    public static void main(String[] args){
        Suv suv = new Suv();
        suv.moveForward();
        suv.moveBackword();
        suv.powerOn();
        suv.powerOff();
        suv.changeGear(3);
    }
    
}
