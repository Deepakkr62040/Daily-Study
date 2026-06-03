package Java.methods;

public class MethodOverloading {
    void funAdd(int a, int b){
        System.out.println(a+b);
    }

    void funAdd(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading();
        obj.funAdd(10,25);
        obj.funAdd(10, 20, 35);
    }
}