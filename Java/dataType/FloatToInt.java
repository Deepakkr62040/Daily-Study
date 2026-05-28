package Java.dataType;

public class FloatToInt {
    public static void main(String[] args) {
        float a = 20.6f;

        System.out.println("the float no is "+a);
        
        int intNumber=(int)a;
        System.out.println("incompatible types: possible lossy conversion from float to int");
        System.out.println("Int Number: " +intNumber);
    }
}
