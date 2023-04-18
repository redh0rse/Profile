//remove blank spaces from a string from the begining and ending
public class StringTrim {
    public static void main(String[] args) {
        String str = "          Java Programming        ";
        System.out.println("Before trim(): "+str);
        str = str.trim();
        System.out.println("After trim(): "+str);
    }
}
