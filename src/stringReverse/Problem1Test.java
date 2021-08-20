package stringReverse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    Problem1 problem1;

    @BeforeEach
    public void init() {
        problem1 = new Problem1();
    }

    @Test
    public void testSolve_emptyString_emptyString() {
        String res = problem1.solve("");
        assertEquals("", res);
    }

    @Test
    public void testSolve_oneSymbol_sameString() {
        String res = problem1.solve("a");
        assertEquals("a", res);
    }

    @Test
    public void testSolve_alphabeticString() {
        String res = problem1.solve("abcd");
        assertTrue(res.equals("dcba"));
    }

    @Test
    public void testSolve_stringWithSpace() {
        String res = problem1.solve("ab  cd");
        assertTrue(res.equals("dc  ba"));
    }

    @Test
    public void testSolve_stringNull() {
        String res = problem1.solve(null);
        assertNull(Problem1.solve(null));
    }

    @Test
    public void testSolve_stringUpperLowerCase() {
        String res = problem1.solve("MaMa");
        assertEquals("aMaM", res);
    }
    @Test
    public void testSolve_stringSpecialSymbols(){
        String res=problem1.solve("@8Æ ™ €");
        assertEquals("€ ™ Æ8@", res);
    }

}