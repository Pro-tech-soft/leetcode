
//Given an integer x, return true if x is a palindrome, and false otherwise.

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String string1 = String.valueOf(x);
        String reverseString = new StringBuilder(string1).reverse().toString();
        return string1.equals(reverseString);
    }
}
