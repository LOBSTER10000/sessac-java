package _04_class;

// 클래스
// -객체 지향 프로그래밍의 기초
// - 클래스를 통해 인스턴스 생성
public class Student {

    public static String name;
    public static int grade;
    public static int student_ID;
    public static int totalStudents;
    public Student(){
        super();
    }
    public Student(String name, int grade, int student_ID){

        this.name = name;
        this.grade = grade;
        this.student_ID = student_ID;
        totalStudents++;
    }
    
   public static int getGrade(){
        return grade;
   }

   public static int getStudent_ID(){
        return student_ID;
   }

   public static String getName(){
        return name;
   }

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setGrade(int grade) {
        Student.grade = grade;
    }

    public static void setStudent_ID(int student_ID) {
        Student.student_ID = student_ID;
    }

    public static void displayInfo(){
        System.out.println("-------- 정보 --------");
        System.out.println("이름 : " + getName());
        System.out.println("학번 : " + getStudent_ID());
        System.out.println("성적 : " + getGrade());
    }
}
