package _04_class._05_pack05;

public class StudentEx {
    public static void main(String[] args){
        Student std1 = new Student("김새싹", 20);

        // Case1. 부모, 자식 클래스의 필드가 public인 경우
        System.out.println(std1.name);
        System.out.println(std1.age);
        System.out.println(std1.campus);

        // Person(부모)로부터 상속받은 메서드
        std1.say();
        std1.eat("바나나");

        // student 메소드 호출
        std1.setCampus("코딩온");
    }

}
