package _03_array;

public class Student {

    private String name;
    private int age;

    public Student(){
        super();
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 ='" + name + '\'' +
                ", 나이 =" + age;
    }
}
