package _04_class;

// 정적(static) 멤버
// - 객체를 생성할 필요 없이 클래스를 통해서 바로 접근
// - 클래스가 메모리에 로딩되면 정적 멤버는 바로 사용 가능
// - 클래스 이름.XX (dot .) 연산자로 접근가능
// - 객체 자신의 참조인 this 사용 불가능
public class Calculator {

    static double pi = 3.141592;

    // plus, minus
    static int plus (int x, int y) {
        return x - y;
    }

}
