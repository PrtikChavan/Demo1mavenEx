package com.ltidemos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCalc {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
Calculator c= new Calculator();
@Test
	public void testHello()
	{
		Assertions.assertEquals("Hello Word",c.sayHello());
	}
@Disabled
@Test
public void testAddition()
{
	Assertions.assertEquals(400, c.addNos(200,300));
}
@Test
public void testSubtract()
{
	Assertions.assertEquals(400, c.subNos(200,100));
}

@Test
void testAssertFalse() {
Assertions.assertFalse("FirstName".length() == 10);
Assertions.assertFalse(10 > 20, "assertion message");
}
@Test
public void testEmptyArrayList() {
ArrayList<Integer> al = new ArrayList<Integer>();
Assertions.assertEquals(0, al.size());
Assertions.assertTrue(al.isEmpty()); // assertTrue Method
al.add(100);
al.add(200);
Assertions.assertEquals(0, al.size());
// assertFalse(al.isEmpty());
}
}
