public class DataTypes {

    public static void main(String[] args){
        System.out.println("=== Primitive Type(기본형) ===");

        //정수형 변수
        int x = 10;
        long y = 100000000L;
        short z = 32767;
        byte b = 127;

        // 실수형 변수
        double dd = 20.0;
        float ff = 3.14f;

        // 불리언(논리형) 변수
        boolean tr = true;

        // 문자 변수 (유니코드 저장할 수 있는 자료형 0~65);
        char ch = 'A';

        // 문자열 변수
        String texts = "안녕하세요";

        System.out.println("정수형 변수 " + x +" "+ y + " " + z + " "+ b);
        System.out.println("실수형 변수 " + dd + " " + ff);
        System.out.println("논리형 변수 " + tr);
        System.out.println("문자열 변수 " + texts);


        // String 참조형 변수
        // Java에서 String 타입은 특별함.  참조형인데 기본형처럼 사용함
        // 기본 자료형은 == 연산자를 이용해서 비교하지만 String 타입은 .equals()타입을 이용해서 비교함
        String greeting = "Hello, World!";
        System.out.println(greeting.equals("Hello"));

        //
        int[] numbers = {1,2,3,4,5};
        Person person = new Person("John", 30);

        for(int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }

        System.out.println(person.getName() + " " + person.getAge());
    }
}

class Person {
    //필드 속성
    private String name;
    private int age;

    //생성자

    public Person(String name, int age){
            this.name = name;
            this.age = age;
    }

    //메서드
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}