package _05_interface;

public class CdPlayer implements Music{
    @Override
    public void play(String song) {
        System.out.println("CD 플레이어에서 " +"'" +song + "'" + " 음악을 재생합니다.");
    }

    @Override
    public void stop(String song) {
        System.out.println("CD 플레이어에서 " +"'" +song + "'" + " 음악을 정지합니다.");
    }
}
