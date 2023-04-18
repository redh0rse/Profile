import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        String vowels = "aeiouAEIOU";
        int i, v = 0;
        for (i =0 ; i<str.length();i++){
            System.out.println(vowels.indexOf(str.charAt(i)));
        }
        for(i=0; i<str.length();i++){

            if(vowels.indexOf(str.charAt(i)) >-1){
                v++;
            }
            i++;
        }
        System.out.println("Total number of vowels in the string: "+v);
    }
}
