//explain startsWith() and endsWith()
public class StartsEnds {
    public static void main(String[] args) {
        String str = "eduincs.com";
        System.out.println("end with .com: "+str.endsWith(".com"));
        System.out.println("end with .COM: "+str.endsWith(".COM"));
        System.out.println("starts with edu: "+str.startsWith("edu"));
        System.out.println("end with edu: "+str.endsWith("edu"));
        System.out.println("starts with .com: "+str.startsWith(".com"));
    }
}
