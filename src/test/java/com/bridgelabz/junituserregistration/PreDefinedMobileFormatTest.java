package com.bridgelabz.junituserregistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PreDefinedMobileFormatTest {

	@Test
	public void Firstname() {
		PreDefinedMobileFormat registration = new PreDefinedMobileFormat();
		boolean check = registration.FirstName();
		assertTrue(check);
	}
	@Test
	public void LastName() {
		PreDefinedMobileFormat registration = new PreDefinedMobileFormat();
		boolean check = registration.LastName();
		assertTrue(check);
	}
	@Test
	public void Email() {
		PreDefinedMobileFormat registration = new PreDefinedMobileFormat();
		boolean check = registration.Email();
		assertTrue(check);
	}
	@Test
	public void MobileFormat() {
		PreDefinedMobileFormat registration = new PreDefinedMobileFormat();
		boolean check = registration.MobileFormat();
		assertTrue(check);
	}
}

