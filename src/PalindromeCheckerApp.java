public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reverse = new StringBuilder(word).reverse().toString();

        if(word.equals(reverse))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}