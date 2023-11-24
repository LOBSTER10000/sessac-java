package _04_class._06_pack06;

public class Test4 {
    public static void main(String[] args){
        Develop d1 = new Develop();
        d1.makeDevelop();
        System.out.println("----------------");

        JavaScript j1 = new JavaScript("자바스크립트", "Node.js", "React", "Sequelize", 2023);
        j1.makeDevelop();
        j1.makeEvent();
        j1.makeByDevelop();
        System.out.println("----------------");

        Java j2 = new Java("자바", "SpringBoot", "JSP", "Mybatis", 2023);
        j2.makeDevelop();
        j2.makeOOP();
        j2.makeByDevelop();
        System.out.println("-----------------");

    }

}
