import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int abc = 0;
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)=='a') abc++;
            if(str.charAt(i)=='b') abc++;
            if(str.charAt(i)=='c') abc++;
        }
        return abc;
    }

    // Checks to see whether str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return(str.contains("The") || str.contains("the"));
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        return (str.equalsIgnoreCase(reverse));
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input a string bro");
        String str = scan.nextLine();
        System.out.println("it has " + countABC(str) + " a's, b's, and c's");
        if(containsThe(str)) {
            System.out.println("it contains the or The.");
        }
        else System.out.println("it does not contain the or The.");

        if(isPalindrome(str)) {
            System.out.println("it is a palindrome.");
        }
        else System.out.println("it is not a palindrome");
    }
}
