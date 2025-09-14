import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        assertEquals("fl", prefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", prefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}