package org.lxh.junitdemo;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

	@Test
	public void testDiv() {
		try {
			Assert.assertEquals(new MyMath().div(10, 2), 1); // 准确的一个数字
			Assert.assertEquals(new MyMath().div(10, 3), 3, 1); // 允许有上下1个数字的的误差
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
