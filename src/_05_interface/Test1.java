package _05_interface;

public class Test1 {

    public static void main(String[] args){
        CdPlayer cd = new CdPlayer();
        cd.play("엔믹스 love me like this");
        cd.stop("엔믹스 love me like this");

        Mp3Player mp3 = new Mp3Player();
        mp3.play("사잔 올스타즈 쓰나미");
        mp3.stop("사잔 올스타즈 쓰나미");
    }
}
