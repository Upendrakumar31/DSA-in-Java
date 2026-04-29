package Oops.Polymorphism;

public class methodOverloading {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();
        System.out.println(Calc.sum(1, 07));
    }
}
class Calculator{
   int sum (int a, int b){
    return a+b;
   }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
