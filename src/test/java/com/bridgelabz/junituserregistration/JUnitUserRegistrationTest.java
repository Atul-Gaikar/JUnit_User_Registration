package com.bridgelabz.junituserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUnitUserRegistrationTest {

	@Test
	public void Firstname() {
		JUnitUserRegistration registration = new JUnitUserRegistration();
		boolean check = registration.FirstName();
		assertTrue(check);
	}
	@Test
	public void LastName() {
		JUnitUserRegistration registration = new JUnitUserRegistration();
		boolean check = registration.LastName();
		assertTrue(check);
	}
	@Test
	public void Email() {
		JUnitUserRegistration registration = new JUnitUserRegistration();
		boolean check = registration.Email();
		assertTrue(check);
	}
	@Test
	public void MobileFormat() {
		JUnitUserRegistration registration = new JUnitUserRegistration();
		boolean check = registration.MobileFormat();
		assertTrue(check);
	}
}

