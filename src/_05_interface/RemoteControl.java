package _05_interface;

public interface RemoteControl {

    // 추상 메소드
    public void turnOn();

    public void turnOff();

    public void setVolume(int volume);

    //상수필드
    // - 인터페이스에 선언된 필드는 모두 public static final" 특징을 지님
    // - 따라서 생략하더라도 과정에서 자동적으로 붙게됨

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}
