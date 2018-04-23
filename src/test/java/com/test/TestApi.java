package com.test;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.core.Bloggers;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestApi {
	
	 Client client= new Client();
	 WebResource res=client.resource("https://jsonplaceholder.typicode.com/comments");
	 Bloggers blog=res.get(Bloggers.class);
	
	
	 
    Integer a=1;
	String ras=a.getClass().getSimpleName();
	String b="rabin";
	String str=b.getClass().getSimpleName();

	@Test
	public void testEmailIsString() {
		
		 
		
		 assertEquals(blog.getEmail().getClass().getSimpleName(), str);
		 
		// System.out.println(blog.getEmail().getClass().getSimpleName());
		
	}
	
	
	@Test
	public void testNameIsString() {
		
		 assertEquals(blog.getName().getClass().getSimpleName(), str);
		 
		// System.out.println(blog.getName().getClass().getSimpleName());
		
	}

	
	@Test
	public void testBodyIsString() {
		
		 assertEquals(blog.getBody().getClass().getSimpleName(), str);
		 
		// System.out.println(blog.getBody().getClass().getSimpleName());
		
	}
	
	@Test
	public void testIdIsInteger() {
		
		
		
		assertEquals(blog.getId().getClass().getSimpleName(), ras);
		 
		//System.out.println(blog.getId().getClass().getSimpleName());
		 
		
	}
	
	@Test
	public void testPostIdIsIntiger() {
		
		
		
		assertEquals(blog.getPostId().getClass().getSimpleName(), ras);
		 
		//System.out.println(blog.getPostId().getClass().getSimpleName());
		 
		
		
	}
	
	
	
}
