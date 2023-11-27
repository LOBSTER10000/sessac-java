package _05_interface;

public class Monitor implements RemoteControl{
    // 필드
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("모니터 전원 ON");
    }

    @Override
    public void turnOff() {
        System.out.println("모니터 전원 OFF");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME){
            volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }

        System.out.println("현재 모니터의 음량은 " + volume);
    }
}
