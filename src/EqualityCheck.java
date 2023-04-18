//compare equality of two string
public class EqualityCheck {
    public static void main(String[] args) {
        String str = "eduincs.com";
        String str2 = "EduInCS.Com";
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
    }
}
