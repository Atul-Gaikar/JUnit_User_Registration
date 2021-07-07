package com.bridgelabz.junituserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EnterAValidFirstNameTest {

	@Test
	public void check_Valid_Firstname() {
		EnterAValidFirstName registration = new EnterAValidFirstName();
		boolean check = registration.FirstName();
		assertTrue(check);
	}
}
