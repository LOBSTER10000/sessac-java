package _04_class;

import java.util.ArrayList;
import java.util.List;

public class StudentEx {

    public static void main(String[] args){

            new Student("안녕", 95, 10);
                Student.displayInfo();
            new Student("안녕2", 90, 15);
                Student.displayInfo();
            new Student("허허", 95, 20);
                Student.displayInfo();

        int totalStudents = Student.totalStudents;
        System.out.println("총 학생의 수는 : "  + totalStudents + "명 입니다.");
    }
}
