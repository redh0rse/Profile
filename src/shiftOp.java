//check shift operations
public class shiftOp {
    public static void main(String[] args) {
        int a = 6;
        int b = a<<1;
        int c = a<<2;
        int d = 70;
        int e = d>>>1;
        int f = d>>1;
        int g = -12;
        int h = g>>>1;
        int i = g>>1;
        System.out.println("Left shift (a, 1): "+b);
        System.out.println("Left shift (a, 2): "+c);

        System.out.println("Unsigned Right shift (d, 1): "+e);
        System.out.println("Signed Right shift (d, 1): "+f);

        System.out.println("Unsigned Right shift (g, 1): "+h);
        System.out.println("Signed Right shift (g, 1): "+i);
    }
}
