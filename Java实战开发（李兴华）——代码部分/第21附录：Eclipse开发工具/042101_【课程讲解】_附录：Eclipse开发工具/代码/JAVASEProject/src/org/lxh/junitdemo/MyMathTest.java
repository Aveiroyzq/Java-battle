package org.lxh.junitdemo;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

	@Test
	public void testDiv() {
		try {
			Assert.assertEquals(new MyMath().div(10, 2), 1); // ׼ȷ��һ������
			Assert.assertEquals(new MyMath().div(10, 3), 3, 1); // ����������1�����ֵĵ����
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
