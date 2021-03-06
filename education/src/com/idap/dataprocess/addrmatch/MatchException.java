package com.idap.dataprocess.addrmatch;

public class MatchException extends Exception {
	private static final long serialVersionUID = 1L;

	public MatchException() {
		super();
	}

	public MatchException(String message) {
		super(message);
	}

	public MatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public MatchException(Throwable cause) {
		super(cause);
	}
}
