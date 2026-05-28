package Java.basic;

public class TypeCasting {
    public static void main(String args[]){
        // System.out.println("Widening Casting (Automatic)");
        // System.out.println("byte → short → int → long → float → double\n");

        // byte b = 10;
        // short s = b;
        // int i = s;
        // long l = i;
        // float f = l;
        // double d = f;

        // System.out.println("Byte: " + b);
        // System.out.println("Short: " + s);
        // System.out.println("Int: " + i);
        // System.out.println("Long: " + l);
        // System.out.println("Float: " + f);
        // System.out.println("Double: " + d);



        System.out.println("Narrowing Casting (Manual)");
        System.out.println("double → float → long → int → short → byte\n");

        double d = 100.99;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("Double: " + d);
        System.out.println("Float: " + f);
        System.out.println("Long: " + l);
        System.out.println("Int: " + i);
        System.out.println("Short: " + s);
        System.out.println("Byte: " + b);

    }
}
