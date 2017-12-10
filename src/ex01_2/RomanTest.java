package ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {

	@Test
	public void testToRoman(){
        assertEquals("I", Roman.toRoman(1));
        assertEquals("III", Roman.toRoman(3));
        assertEquals("IV", Roman.toRoman(4));
        assertEquals("XIX", Roman.toRoman(19));
        assertEquals("XX", Roman.toRoman(20));
	}

	@Test
    public void testToRomanOutOfRange() {
        assertEquals("変換できません", Roman.toRoman(0));
        assertEquals("変換できません", Roman.toRoman(21));
    }

}
