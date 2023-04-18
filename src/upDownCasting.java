//explain upcasting and downcasting
public class upDownCasting {
    public static void main(String[] args) {
        byte b;     // 8 bit
        short s = 100;  // 16 bit
        b = (byte)s;    // down casting
        System.out.println("b = "+b);
        s = 250;
        b = (byte)s;    // down casting
        System.out.println("b = "+b);
        b = 100;
        s = (short) b;  // upcasting
        System.out.println("s = "+s);
        int i;
        i = (int)s;     // upcasting
        System.out.println("i = "+i);

    }
}
