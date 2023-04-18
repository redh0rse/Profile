//explain the function of toLowerCase() and toUpperCase()
public class UpperLowerCase {
    public static void main(String[] args) {
        String str = "India";
        System.out.println("Length of str: "+str.length());
        String stru = str.toUpperCase();
        System.out.println("stru in Upper case: "+stru);
        System.out.println("str current state: "+str);
        String strl = str.toLowerCase();
        System.out.println("strl in Lower case: "+strl);
        System.out.println("str current state: "+str);
        String s = "Java Programming";
        s = s.toUpperCase();
        System.out.println("s current state: "+s);
    }
}
