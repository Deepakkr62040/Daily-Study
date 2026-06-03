package Java.methods;

class ChildA{
    void sumNum(int a, int b){
        System.out.println("Parent class");
        System.out.println(a + b);
    }
}

class ChildB extends ChildA{
    void sumNum(int a, int b){
        System.out.println("Child class");
        System.out.println(a + b);
    }
}

public class MethodOverriding {
    
    public static void main(String args[]){
        ChildA obj = new ChildA();
        obj.sumNum(10, 20);

        ChildB oj = new ChildB();
        oj.sumNum(30, 40 + 20);

    }
}
