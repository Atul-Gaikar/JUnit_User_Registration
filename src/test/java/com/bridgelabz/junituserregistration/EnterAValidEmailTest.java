package com.bridgelabz.junituserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EnterAValidEmailTest {

	@Test
	public void Firstname() {
		EnterAValidEmail registration = new EnterAValidEmail();
		boolean check = registration.FirstName();
		assertTrue(check);
	}
	@Test
	public void LastName() {
		EnterAValidEmail registration = new EnterAValidEmail();
		boolean check = registration.LastName();
		assertTrue(check);
	}
	@Test
	public void Email() {
		EnterAValidEmail registration = new EnterAValidEmail();
		boolean check = registration.Email();
		assertTrue(check);
	}
}

