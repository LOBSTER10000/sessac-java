package _04_class._05_pack05;

public class SingletonEx {

    public static void main(String[] args){
        // 생성자의 접근 제한자가 private라서 다른 클래스에서 접근할 수 있도록 바꿈
        //Singleton s1 = new Singleton() (X)

        // 정적 메서드 호출해서 싱글턴 객체를 얻음
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1 == s2){
            System.out.println("1"); // 싱글턴은 결국 new와는 다르게 참조값도 같은 객체임을 안내
        } else {
            System.out.println("2");
        }

        System.out.println(s1);
        System.out.println(s2);
    }
}
