package Oops.Inheritence;

public class inheitence {
    public static void main(String[] args) {
        Tuna blueTuna = new Tuna();
        blueTuna.Breathe();
    }
}
 
// Base Class //
class Animal{
    String color;
    void Eat() {
        System.out.println("eats");
    }
    void Breathe(){
        System.out.println("breaths");
    }
}

// Derived class //
class Fish extends Animal{
    int Fins;
    void Swim() {
        System.out.println("Swim in Water");
    }
}
// Multi Level Inheritence //
class Tuna extends Fish {
    int Size;
    void rating(){
        System.out.println("5 Star");
    }
}
