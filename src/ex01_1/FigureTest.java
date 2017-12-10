package ex01_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureTest {

    @Test
    public void test() {
        assertEquals("1", Figure.toString(1));
        assertEquals("2", Figure.toString(2));
        assertEquals("△", Figure.toString(3));
        assertEquals("□", Figure.toString(5));
        assertEquals("◆", Figure.toString(15));
    }

}
