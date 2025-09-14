import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        ValidPalindrome pal = new ValidPalindrome();
        assertTrue(pal.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(pal.isPalindrome("race a car"));
        assertTrue(pal.isPalindrome(" "));
        assertFalse(pal.isPalindrome("0P"));
    }
}