package _04_class._05_pack05;

// 상속
// - Java 다중 상속 미지원 = extends 키워드 뒤에는 부모 클래스 하나만 올 수 있음
// - 부모 클래스 = 슈퍼 클래스
//  - 자식 클래스 = 서브 클래스
public class Person {
    // Case1. public 필드를 선언

    public String name;

    public int age;

    //생성자
    // 부모클래스가 기본 생성자를 갖는 경우


    public Person(){
        System.out.println("부모 클래스의 Person() 생성자가 실행됨");
    }

    // 일반 메서드

    public void say(){
        System.out.println("안녕!");
    }

    public void eat(String food){
        System.out.println(food +"를 먹고 있음!");
    }

}
