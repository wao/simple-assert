package info.thinkmore;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleAssertTest {
	@Test(expected= info.thinkmore.Assert.AssertError.class)
	public void testAssertTrueFail() {
		info.thinkmore.Assert.assertTrue(false);
	}

    @Test
	public void testAssertTrue() {
		info.thinkmore.Assert.assertTrue(true);
    }

    @Test
	public void testAssertEquals() {
		info.thinkmore.Assert.assertEquals(2, 2);
    }

	@Test(expected= info.thinkmore.Assert.AssertError.class)
	public void testAssertEqualsFail() {
		info.thinkmore.Assert.assertEquals(2, 3);
    }

}
