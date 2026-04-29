package Oops.Interfaces;

public class multipleInterfaces {
    public static void main(String[] args) {
        human object = new human();
        object.eat();
        object.hunt();
        object.quite();
        object.caring();
}
}

interface Carnivores{
    void eat();
    void hunt();
}

interface Herbivore{
    void quite();
    void caring();
}

class human implements Carnivores,Herbivore{
   public void eat(){
        System.out.println("Eat Non veg");
    }
     public void hunt(){
        System.out.println("Hunting");
    }
     public void quite(){
        System.out.println("Quite in nature");
    }
     public void caring(){
        System.out.println("Caring in nature");
    }
}
