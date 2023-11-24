package _04_class._06_pack06;

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }


}
