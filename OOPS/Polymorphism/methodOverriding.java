package Oops.Polymorphism;

public class methodOverriding {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("Eat anything");
    }
}
class Deer extends Animal {
    void eat(){
        System.out.println("Eat only grass");
    }
}

//Output will be Eat only grass because  when we will create child object then it will call child function only //