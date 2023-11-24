package _04_class._06_pack06;

public class Cat extends Animal{

    public Cat(String species, String name, int age){
        super(species, name, age);
        setSpecies("고양이");
    }

    public Cat() {
        setSpecies("고양이");
    }

    @Override
    public void makeSound(){
        System.out.println("야옹!");
    }

    public void makeFight(){
        System.out.println("냥냥이는 할퀴기 시작했다!");
    }

}
