package app;

public class InvalidAgeException extends RuntimeException{
	InvalidAgeException () {
		super();
	}
	InvalidAgeException (String msg) {
		super(msg);
	}
	@Override
	public String toString() {
		return super.getMessage();
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}