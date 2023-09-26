import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringchecksTest {
    Stringchecks stringchecks = new Stringchecks();
    @DisplayName("test check for isogram")
    @Test
    void checkIsogram() {
        assertEquals(false, stringchecks.checkIsogram("geekforgeeks"));
        assertEquals(true, stringchecks.checkIsogram("algorithm"));
        assertEquals(false, stringchecks.checkIsogram("datastructures"));
        assertEquals(false, stringchecks.checkIsogram("machinelearning"));
        assertEquals(true, stringchecks.checkIsogram("importance"));
    }

    @DisplayName("test check for panagram")
    @Test
    void checkPanagram() {
        assertEquals(true, stringchecks.checkPanagram("AbCDefGhIJklmnoPQRStuvWXyZ234"));
        assertEquals(true, stringchecks.checkPanagram("Pack my box with five dozen liquor jugs"));
        assertEquals(true, stringchecks.checkPanagram("Waltz, bad nymph, for quick jigs vex"));
        assertEquals(false, stringchecks.checkPanagram("machinelearning"));
        assertEquals(false, stringchecks.checkPanagram("importance"));
    }

    @DisplayName("test check for anagram")
    @Test
    void checkAnagram() {
        assertEquals(true, stringchecks.checkAnagram("Listen","silent"));
        assertEquals(false, stringchecks.checkAnagram("geeksforgeeks","geeks"));
        assertEquals(true, stringchecks.checkAnagram("a gentleman", "elegant man"));
        assertEquals(true, stringchecks.checkAnagram("geeksforgeeks","forgeeksgeeks"));
        assertEquals(true, stringchecks.checkAnagram("angel","glean"));
    }
}