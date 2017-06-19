/**
 * 
 */
package com.mypractice.logic;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Saurabh
 *
 */
public class AnagramTest {

	@Test
	public void test() {
		Boolean expected = true;
		Boolean actual = Anagram.isAnagram("", "");
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

}
