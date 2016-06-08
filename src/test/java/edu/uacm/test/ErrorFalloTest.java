package edu.uacm.test;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;


public class ErrorFalloTest {
	
	Vector v =null;
	
	@Test(expected= NullPointerException.class)
	public void errorTest(){
		v.capacity();
		
	}
	@Test
	public void falloTest(){
		Vector vector = new Vector<String>();
		vector.addElement(new String("elemento 1"));
		Assert.assertEquals(vector.capacity(), 2);
	}

}
