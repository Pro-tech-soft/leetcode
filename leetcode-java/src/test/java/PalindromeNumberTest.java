import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber pal = new PalindromeNumber();
        assertTrue(pal.isPalindrome(121));
        assertFalse(pal.isPalindrome(-121));
        assertFalse(pal.isPalindrome(10));
    }
}