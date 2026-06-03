package Java.methods;

class DemoMethods {
    void funAdd(){
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println(sum);
    }
    public static void main(String args[]){
        DemoMethods obj = new DemoMethods();
        obj.funAdd();
    }
}