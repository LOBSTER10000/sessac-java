package _04_class._06_pack06;

public class Test3 {

    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.makeSound();
        System.out.println("-------------------------");

        Cat c1 = new Cat();
        c1.setAge(20);
        c1.setName("은돌잉");
        System.out.println("종 : "+ c1.getSpecies() + ", 이름 : "+ c1.getName() +", 나이 : " +c1.getAge());
        c1.makeSound();
        c1.makeFight();
        System.out.println("-----------------------------");

        Cat c2 = new Cat("cat", "코딩온", 13);
        System.out.println("종 : "+ c2.getSpecies() + ", 이름 : "+ c2.getName() +", 나이 : " +c2.getAge());
        c2.makeSound();
        c2.makeFight();
        System.out.println("-----------------------------");

        Dog d1 = new Dog();
        d1.setAge(14);
        d1.setName("포르네우스14세");
        System.out.println("종 : "+ d1.getSpecies() + ", 이름 : "+ d1.getName() +", 나이 : " +d1.getAge());
        d1.makeSound();
        d1.makeFight2();
    }
}
