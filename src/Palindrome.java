import java.lang.*;
import java.util.*;

//check palindrome
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0, j = str.length()-1;
        boolean p = true;
        for(i=0; i<j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                p = false;
                break;
            }
        }
        if (p)
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}
