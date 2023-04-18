//separate domain name and domain extension from a string
public class Domain {
    public static void main(String[] args) {
        String str = "eduincs.com";
        int i = str.indexOf(".com");
        String domain = str.substring(0,i);
        System.out.println("domain name: "+domain);
        String ex = str.substring(i+1, str.length());
        System.out.println("domain extension: "+ex);
    }
}
