package foo.bar.qix;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarQixTest {

    @Test
    public void testFormatNumber() throws Exception {
        assertEquals(FooBarQix.formatNumber(1), "1");

        // Basic
        assertEquals(FooBarQix.formatNumber(3), "FOOFOO");
        assertEquals(FooBarQix.formatNumber(5), "BARBAR");
        assertEquals(FooBarQix.formatNumber(7), "QIXQIX");

        // Advanced
        assertEquals(FooBarQix.formatNumber(13), "FOO");
        assertEquals(FooBarQix.formatNumber(15), "FOOBARBAR");
        assertEquals(FooBarQix.formatNumber(33), "FOOFOOFOO");

        // Divisors should have high precedence
        assertEquals(FooBarQix.formatNumber(51), "FOOBAR");

        //The content sould be analysed in the order they appear
        assertEquals(FooBarQix.formatNumber(53), "BARFOO");
    }
}
