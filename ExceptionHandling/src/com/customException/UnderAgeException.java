package com.customException;

public class UnderAgeException extends Exception {
public UnderAgeException() {
	super("You are too young to take the Driving Lisence");
}
}
