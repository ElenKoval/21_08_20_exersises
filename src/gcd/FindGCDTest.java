package gcd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringReverse.Problem1;

import static org.junit.jupiter.api.Assertions.*;

class FindGCDTest {

    FindGCD findGCD;

    @BeforeEach
    public void init() {
        findGCD = new FindGCD();
    }
    @Test
    public void testGCD_Solve_positiveNumbers() {
        int res = findGCD.gcd_solve(100,50);
        assertEquals(50, res);
    }
    @Test
    public void testGCD_Solve_sameNumbers() {
        int res = findGCD.gcd_solve(100,100);
        assertEquals(100, res);
    }

    @Test
    public void testGCD_Solve_primeNumbers() {
        int res = findGCD.gcd_solve(3,5);
        assertEquals(1, res);
    }

    @Test
    public void testGCD_Solve_bigNumbers() {
        int res = findGCD.gcd_solve(456690000,15000000);
        assertEquals(30000, res);
    }







}