package _04_class;

public class ConstEx {

    public static void main(String[] args){
        // 상수읽기
        // static 필드이므로 객체 생성없이 클래스명, 필드명으로 바로 접근
        System.out.println(Const.GREETING);
        System.out.println(Const.MAX_VALUE);
    }
}
