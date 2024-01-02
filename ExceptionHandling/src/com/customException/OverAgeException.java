package com.customException;

public class OverAgeException extends Exception {
	public OverAgeException() {
		super("You are too old to take the Driveing Lisence");
	}
}
