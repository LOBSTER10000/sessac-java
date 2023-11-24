package _04_class._06_pack06;

public class Dog extends Animal{
    public Dog(String species, String name, int age){
        super(species, name, age);
        setSpecies("강아지");
    }

    public Dog() {
        setSpecies("강아지");
    }

    @Override
    public void makeSound(){
        System.out.println("멍멍!!");
    }

    public void makeFight2(){
        System.out.println("댕댕이는 깨물기 시작했다!");
    }
}
