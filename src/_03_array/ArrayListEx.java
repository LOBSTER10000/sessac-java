package _03_array;

// Collection Framework
// 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 포함시켜 놓음

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList 클래스
public class ArrayListEx {

    public static void main(String[] args){
        // 1. ArrayList 생성 (정수형 요소를 저장하는 예제)
        List<Integer> numbers = new ArrayList<>();

        // 2.  요초 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 3. 요소 접근
        System.out.println("첫 번째 요소 : " +numbers.get(0));

        // 4. 요소 수정
        numbers.set(1, 77); // -> 인데스 1번의 값을 77로 바꿔라
        System.out.println("두 번째 요소 : " + numbers.get(1));

        // 5.  요소 삽입
        numbers.add(1, 7);
        System.out.println("두 번째 요소 : " + numbers.get(1));

        // 6. ArrayList끼리 연결
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(100, 99 , 90));
        numbers.addAll(numbers2);
        System.out.println("numbers2 : " + numbers2);
        System.out.println("numbers : " + numbers);

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); //0
        System.out.println(numbers.indexOf(50)); // 5
        System.out.println(numbers.indexOf(94)); // -1

        // 8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers : " + numbers);

        // 9. 리스트 크기 확인
        System.out.println("numbers length : " + numbers.size());

        // 10. 모든 요소 출력 (반복문)
        for(int n : numbers){
            System.out.println(n + " ");
        }

        // 11. 모든 요소 삭제
        numbers.clear();
        System.out.println(numbers);



        //////////////
        // student 타입 ArrayList 생성
        List<Student> students = new ArrayList<>();

        students.add(new Student("john", 30));
        students.add(new Student("jennie", 24));
        students.add(new Student("rose", 45));
        students.add(new Student("park", 56));
        students.add(new Student("son", 32));

        System.out.println("학생 수 : " + students.size());
        Student std1 = students.get(0);
        System.out.println(std1.getName() + " " + std1.getAge());
        System.out.println(std1); // 참조하는 주소값이 출력이 되는 것

        // for each 배열로 출력
        for(Student st : students){
            System.out.println(st);
        }

        students.remove(2);
        students.remove(2);
        System.out.println(students);
    }
}

