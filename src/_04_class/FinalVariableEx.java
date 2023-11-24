package _04_class;

// final 필드
// - final 키워드가 저장된 변수는 단 한번 초기화 되면 값 변경 불가능
public class FinalVariableEx {

    public static void main(String[] args){
        //final 변수 선언, 초기화
        final int finalNum = 1;

        //finalNum = 5; // final 필드는 값을 변경할 수 없으므로 컴파일 에러 발생!

        //final 필드는 오로지 "읽기 전용"으로만 쓰인다

        System.out.println("Final Number : " + finalNum);
    }

}
