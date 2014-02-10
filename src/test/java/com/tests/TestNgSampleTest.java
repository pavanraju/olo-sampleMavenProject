package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.olo.Verify;

public class TestNgSampleTest {
	
	@Test(description="Hi I am tooltip")
	public void test1(){
		throw new SkipException("skip");
	}
	
	@Test
	public void test2(){
		Assert.assertEquals("test","test");
	}
	
	@Test
	public void test3() throws Exception{
		throw new Exception("Failure");
	}
	
	@Test
	public void test4(){
		Verify.verifyEquals("test", "test1");
		Verify.verifyEquals(true, false);
	}
	
	@Test
	public void test5(){
		Verify.verifyEquals("test", "test");
		Verify.verifyEquals(true, true);
	}
	
}
