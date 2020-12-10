package greatspacetest;

import static org.junit.Assert.*;

import org.junit.Test;

public class greatspace1Test {
	private returnhelloworld a = new returnhelloworld();
	@Test
	public void onetest() {
		assertEquals("", 0, a.returnstring(2), 0);
	}
	
	@Test
	public void twotest() {
		assertEquals("", 1, a.returnstring(1), 0);
	}

}
