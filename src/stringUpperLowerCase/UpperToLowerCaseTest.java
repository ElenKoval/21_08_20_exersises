package stringUpperLowerCase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringReverse.Problem1;

import static org.junit.jupiter.api.Assertions.*;

class UpperToLowerCaseTest {

    UpperToLowerCase upperToLowerCase;

    @BeforeEach
    public void init() {
        upperToLowerCase = new UpperToLowerCase();
    }


    @Test
    public void testSolve_emptyString() {
        String res = upperToLowerCase.changeUpperLower("");
        assertEquals("", res);
    }

    @Test
    public void testSolve_StringAlphabetic() {
        String res = upperToLowerCase.changeUpperLower("MaMaMa");
        assertEquals("mAmAmA", res);
    }

    @Test
    public void testSolve_StringNonAlphabetic() {
        String res = upperToLowerCase.changeUpperLower("1234!@*");
        assertEquals("1234!@*", res);
    }

    @Test
    public void testSolve_StringWithAlphabeticAndNonAlphabetic() {
        String res = upperToLowerCase.changeUpperLower("!#$MaM");
        assertEquals("!#$mAm", res);
    }

    @Test
    public void testSolve_StringWithSpace() {
        String res = upperToLowerCase.changeUpperLower("   ");
        assertEquals("   ", res);
    }

    @Test
    public void testSolve_UpperCaseStrin() {
        String res = upperToLowerCase.changeUpperLower("MMMMM");
        assertTrue(res.equals("mmmmm"));
    }

    @Test
    public void testSolve_LowerCaseStrin() {
        String res = upperToLowerCase.changeUpperLower("mmmmm");
        assertFalse(res.equals("mmmmm"));
    }


}