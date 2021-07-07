package com.bridgelabz.junituserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PreDefinedPasswordTest {

	@Test
	public void Firstname() {
		PreDefinedPassword registration = new PreDefinedPassword();
		boolean check = registration.FirstName();
		assertTrue(check);
	}

	@Test
	public void LastName() {
		PreDefinedPassword registration = new PreDefinedPassword();
		boolean check = registration.LastName();
		assertTrue(check);
	}

	@Test
	public void Email() {
		PreDefinedPassword registration = new PreDefinedPassword();
		boolean check = registration.Email();
		assertTrue(check);
	}

	@Test
	public void MobileFormat() {
		PreDefinedPassword registration = new PreDefinedPassword();
		boolean check = registration.MobileFormat();
		assertTrue(check);
	}

	@Test
	public void PasswordFormat() {
		PreDefinedPassword registration = new PreDefinedPassword();
		boolean check = registration.Password();
		assertTrue(check);
	}
}
