//explaining substring method()
public class Substring {
    public static void main(String[] args) {
        String str = "Indian Economy";
        String sub = str.substring(3);
        System.out.println(sub);
        String sub2 = str.substring(3,str.length()-4);
        System.out.println(sub2);
        String strn = str.replace('E','e');
        System.out.println(strn);
    }
}
