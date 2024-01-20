package algorism;

import java.util.NoSuchElementException;
public class ArrList<E> {
    private E a[]; //리스트의 항목들을 저장할 배열
    private int size; // 리스트들의 항목 수
    public ArrList(){
        a = (E[]) new Object[1]; // 최초로 한개의 원소를 가진 배열
        size = 0; // 항목수를 초기화
    }

    private E peek(int k){ // k번째 항목을 리턴, 단순히 읽기만 한다.
        if(size == 0){
            throw new NoSuchElementException();} // underflow 경우에 프로그램 정지
            return a[k]; // 사이즈가 0이 아니면 a[k]를 리턴한다.
    }

    public void insertLast(E newItem){
        if (size == a.length){
            resize(2*a.length);
        }
        a[size++] = newItem;
    }

    public void insert(E newItem, int k){ // 새항목을 k-1번째 항목 다음에 삽입
        if(size == a.length){ // 배열에 빈 공간이 없으면
            resize(2*a.length); // 배열 크기 2배로 확장
        }
        for(int i = size -1; i >= k; i--){ // 한 칸씩 뒤로 이동
            a[i+1] = a[i];
        }
        a[k] = newItem;
        size++;
    }

    private void resize(int newSize){ // 배열의 크기 조절
        Object[] t = new Object[newSize]; // 새로운 크기의 배열 T 생성
        for(int i = 0; i < size; i++){
            t[i] = a[i];  // 배열 a를 배열 t로 복사
        }
        a = (E[]) t; //배열 t를 배열 s로 복사
    }
}
