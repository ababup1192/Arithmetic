package org.ababup1192;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArithTest {

    @Test
    public void testMultiple() throws Exception {
        assertThat(Arith.multiple(1, 2), is(2));
    }

    @Test
    public void testDivide() throws Exception {
        assertThat(Arith.divide(4, 2), is(2));
    }
}