package deitel.chapter1;

public class MethodOverloading {
    private int num;

    public int add (int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(int a ,double b){
        return a +b;
    }
}
