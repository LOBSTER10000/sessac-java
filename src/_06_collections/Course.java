package _06_collections;

import java.util.Objects;

public class Course {
    private int id;
    private String title;

    public Course(int id, String title){
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    // "id, title" 값이 같으면 동일한 hashCode 리턴
    //hashCode란?
    // - hashCode : 객체의 메모리 주소를 기반으로 한 정수 값의 해시코드
    // - hashCode() 메소드 : Object 클래스 정의되어 있고, 객체의 해시 코드를 반환하는 역할
    // - Course 클래스에서 hashCode() 재정의 : 객체의 내부 상태를 기반으로 한 해시 코드를 생성
    @Override
    public int hashCode() {
        // title은 String(레퍼런스) 타입이므로 hashCode() 메서드 사용 가능
        // id는 int형이므로 정수 값의 해시코드에 더하기 연산
        return title.hashCode() + id;
    }

    // id, title 값이 같으면 true 리턴
    //
    @Override
    public boolean equals(Object o) {
        if (o instanceof Course target) {
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }

    }

   
}
