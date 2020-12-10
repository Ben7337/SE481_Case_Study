package greatspacetest;

import static org.junit.Assert.*;

import org.junit.Test;

public class greatspace1Test {
	private returnhelloworld a = new returnhelloworld();
	@Test
	public void test() {
		assertEquals("", 0, a.returnstring(2), 0);
	}

}
