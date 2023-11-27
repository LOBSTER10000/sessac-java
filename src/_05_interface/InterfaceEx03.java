package _05_interface;

public class InterfaceEx03 {

    public static void main(String[] args){
        Speaker sp = new Speaker();
        sp.turnOn();
        sp.setVolume(11);
        sp.setVolume(-1);
        sp.setVolume(6);
        sp.turnOff();

        Monitor mo = new Monitor();
        mo.turnOn();
        mo.setVolume(9);
        mo.setVolume(12);
        mo.turnOff();

        // interface도 하나의 타입 : 참조형
        // 참조타입이므로 null 가능
        RemoteControl rc;
        rc = new Monitor();
        rc.turnOn();
        rc.setVolume(3);
        rc.turnOff();

        rc = new Speaker();
        rc.turnOn();
        rc.setVolume(12);
        rc.turnOff();
    }
}
