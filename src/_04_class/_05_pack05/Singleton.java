package _04_class._05_pack05;

// 디자인 패턴 중 singleton 패턴
// : 단 하나의 객체임을 보장
// - 애플리케이션에서 단 하나의 객체를 만들고 싶다면, 싱글턴 패턴 쓰자!
// 핵심 개념
// - private 접근 제어자를 이용해 외부에서 new 연산자로 호출 할 수 없도록 막음
// - new 연산자를 이용해 생성자를 호출할 수 없으니 외부에서 객체 생성 불가
// - 싱글턴 패턴이 제공하는 정적 메서드를 통해서 간접적으로 객체를 얻도록 함
public class Singleton {
    // private 접근 권한을 갖는 정적필드 선언

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    // public 접근 권한을 갖는 정적 메소드를 선언
    public static Singleton getInstance(){
        return singleton;
    }
}
