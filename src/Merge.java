//accommodate two 4 bit number into a single 8 bit number using bitwise operator
import java.lang.*;
public class Merge {
    public static void main(String[] args) {
        byte a = 12;    // 0000 1100
        byte b = 14;    // 0000 1110
        int c = 0;     // 0000 0000
        c = c | b;      // 0000 1110
        int d = a<<4;  // 1100 0000
        c = c | d;      // 1100 1110
        System.out.println("a = "+Integer.toBinaryString(a));
        System.out.println("b = "+Integer.toBinaryString(b));
        System.out.println("c = "+Integer.toBinaryString(c));
    }
}
