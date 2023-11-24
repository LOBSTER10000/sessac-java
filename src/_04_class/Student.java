package _04_class;

// 클래스
// -객체 지향 프로그래밍의 기초
// - 클래스를 통해 인스턴스 생성
public class Student {
    //공개클래스 선언
    
    // 1 필드(멤버변수)
    
    public String name;
    public int grade;
    
    // 2. 메서드
    // 2-1. 생성자
    
    public Student(String name, int grade){
        //this 자기 자신 의미
        // this.name -> 현재 인스턴스 변수와 매개변수 이름이 동일하다면 구분해야함
        this.name = name; // 매개변수의 name을 현재 객체의 name 멤버 변수 할당
        this.grade = grade; // 매개변수의 grade를 현재 객체의 grade 멤버 변수 할당 
    }
    
    // 2-2. 일반 메서드
    
    
    
}
