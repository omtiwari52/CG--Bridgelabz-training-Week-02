package AssistedProblems.AnimaHierarchy;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
