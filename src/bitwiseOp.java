//check bitwise operations (AND, OR, NOT, XOR)
public class bitwiseOp {
    public static void main(String[] args) {
        int a = 0b101;
        int b = 0b1000;
        int c = a | b;
        int d = a & b;
        int e = ~a + 1;
        int f = ~c;
        int g = a^b;
        System.out.println("a | b: "+c);
        System.out.println("a & b: "+d);
        System.out.println("~a + 1: "+e);
        System.out.println("~c: "+f);
        System.out.println("a^b: "+g);
    }
}
