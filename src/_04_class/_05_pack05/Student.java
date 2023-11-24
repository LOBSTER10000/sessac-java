package _04_class._05_pack05;

public class Student extends Person{
    // Case1. public 필드를 선언

    public String campus;

    public Student(String name, int age){
        System.out.println("자식 클래스의 Student(String)");

        // 부모로부터 상속받은 필드
        this.name = name;
        this.age = age;
    }
    public void setCampus(String campus){
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부 중 입니다");
    }

}
