package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcase {

	@Test
	public void test() {
		
		Addition a = new Addition();
		int act = a.addition(10, 20);
		int exp = 30;
		
		assertEquals(exp, act);
		
		String str="Hello, its me";
		assertEquals("Hello, its me", str);
	}

}
