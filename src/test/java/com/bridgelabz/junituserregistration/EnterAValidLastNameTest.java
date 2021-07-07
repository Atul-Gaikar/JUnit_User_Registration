package com.bridgelabz.junituserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EnterAValidLastNameTest {

	@Test
	public void Firstname() {
		EnterAValidLastName registration = new EnterAValidLastName();
		boolean check = registration.FirstName();
		assertTrue(check);
	}
	@Test
	public void LastName() {
		EnterAValidLastName registration = new EnterAValidLastName();
		boolean check = registration.LastName();
		assertTrue(check);
	}
}
