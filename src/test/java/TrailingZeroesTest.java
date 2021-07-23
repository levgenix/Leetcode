import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrailingZeroesTest {

    @Test
    void trailingZeroes() {
        assertEquals(4, new TrailingZeroes().trailingZeroes(21));
        assertEquals(0, new TrailingZeroes().trailingZeroes(3));
        assertEquals(1, new TrailingZeroes().trailingZeroes(5));
        assertEquals(0, new TrailingZeroes().trailingZeroes(0));
        assertEquals(2, new TrailingZeroes().trailingZeroes(11));
        assertEquals(24, new TrailingZeroes().trailingZeroes(100));
    }

    @Test
    void preimageSizeFactorialZeroesFunction() {
        /*
        0!  = 1 						        => f(5) = 0
        1!  = 1 						        => f(5) = 1
        2!  = 1 						        => f(5) = 2
        3!  = 6 				                => f(5) = 3
        4!  = 24 				                => f(5) = 4
        5!  = 120			                    => f(0) = 5     0
        6!  = 720			                    => f(5) = 6
        7!  = 5040			                    => f(5) = 7
        8!  = 40320 					        => f(5) = 8
        9!  = 362880 					        => f(5) = 9
        10! = 3628800 					        => f(5) = 10
        11! = 39916800		                    => f(0) = 11    0
        25! = 15511210043330985984000000     	=> f(5) = 25
        26! = 4032914611..05635584000000     	=> f(5) = 26
        30! = 2652528591..36308480000000     	=> f(0) = 30    0
        42! = 14050061..1536384000000000 	    => f(0) = 42    0
        */

        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(0));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(1));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(2));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(3));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(4));
        assertEquals(0, new TrailingZeroes().preimageSizeFactorialZeroesFunction(5));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(6));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(7));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(8));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(9));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(10));
        assertEquals(0, new TrailingZeroes().preimageSizeFactorialZeroesFunction(11));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(25));
        assertEquals(5, new TrailingZeroes().preimageSizeFactorialZeroesFunction(26));
        assertEquals(0, new TrailingZeroes().preimageSizeFactorialZeroesFunction(30));
        assertEquals(0, new TrailingZeroes().preimageSizeFactorialZeroesFunction(42));

    }
}