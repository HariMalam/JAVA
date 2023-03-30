package CWH.Chapter11_Abstract_Classes_And_Interfaces.PracticeSet;

// Question 03: Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this monkey class and implements basicAnimal interface with eat() and sleep() method
// Question 05: Demonstrate polymorphism using monkey class from Que03


interface BasicAnimal {
    void eat();
    void sleep();
}
class Monkey {

    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting..");
    }
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir,");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

public class Ch11_Que03_Que05 {
    public static void main(String[] args) {
        Human hari = new Human();
        hari.speak();
        hari.eat();
        hari.bite();
        hari.jump();
        hari.sleep();

        Monkey chiku = new Human();
        chiku.bite();
        chiku.jump();
        // chiku.speak(); --> cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();
    }
}
