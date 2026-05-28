package Java.basic;

public class TypeCastingIntToByte {
    public static void main(String[] args) {
        // System.out.println("error: incompatible types: possible lossy conversion from int to byte");
        // int i = 130;
        // byte b=(int)i;
        // System.out.println(b);

        int i = 25;
        byte c=(byte)i;
        System.out.println(c);

        long l = 8008469584L;
        byte b=(byte)l;
        System.out.println(b);
    }
}
