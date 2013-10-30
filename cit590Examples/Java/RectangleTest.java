package cit590;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	Rectangle r;
	@Before
	public void setUp(){
		r = new Rectangle(3, 4);
	}

	@Test
	public void testComputeArea() {
		assertEquals(12, r.computeArea());
		r.setBreadth(12);
		r.setLength(8);
		assertEquals(96, r.computeArea());
		//make sure the 0 case is covered
		r.setLength(0);
		assertEquals(0, r.computeArea());
	}
	
	@Test
	public void testComputePerimeter(){
		assertEquals(28, r.computePerimeter());
	}
	
	//show this one in class
	
}
