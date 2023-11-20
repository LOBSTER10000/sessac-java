// 메인 클래스 (시작 클래스) 정의
// main -메서드 가짐
// 메인 클래스는 한 개  (노드로 따지면 진입 점 같은 역할)
public class Main {
    // 주석
    /* 여러줄 주석 */
    /** 문서주석  **/


    //자바 메인 메서드
    // 자바 응용 프로그램의 실행 시작점
    // 애플리케이션이 실행되려면 최소 1개 존재해야 함
    // -JVM은 세미콜론(;)으로 끝나는 문장을 하나의 명령문으로 인식!
    public static void main(String[] args) {

        for (int  i = 1; i<=5 ; i++){
            System.out.println("i + " + i);
        }

        System.out.print("Java Study Start!" + "wow");
        System.out.println("Hello Yeah");
        System.out.printf("Hello and welcome!");
    }
}