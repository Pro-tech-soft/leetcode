
/*
    A phrase is a palindrome if, after converting all uppercase letters
    into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        String string1 = s.replaceAll("[^a-zA-Z0-9]","");
        String reverseString = new StringBuilder(string1.trim()).reverse().toString();
        return string1.trim().equalsIgnoreCase(reverseString);
    }
}
