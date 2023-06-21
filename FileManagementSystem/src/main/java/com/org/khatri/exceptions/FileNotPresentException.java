package com.org.khatri.exceptions;

@SuppressWarnings("serial")
public class FileNotPresentException extends Exception {

	public FileNotPresentException(String message) {
		super(message);
	}

	public FileNotPresentException() {
		super();
	}

}
