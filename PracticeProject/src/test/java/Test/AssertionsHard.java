package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsHard {

	@Test
	public void m1()
	{
	String exp="hi";
	String act="hi";
    Assert.assertEquals(exp, act);
	}

	@Test
	public void m2()
	{
	String exp="hi";
	String act="hi";
    Assert.assertNotEquals(exp, act);
	}
	
	@Test
	public void m3()
	{
	String exp="hi";
	String act="hi";
    Assert.assertTrue(true);
	}

	@Test
	public void m4()
	{
	String exp="hi";
	String act="hi";
    Assert.assertFalse(false);
	}

	@Test
	public void m5()
	{
	String exp="hi";
	String act="hi";
    Assert.assertNull(act);
	}

	@Test
	public void m6()
	{
	String exp="hi";
	String act="hi";
    Assert.assertNotNull(act);
	}


}
