package app;

public class InvalidNameException extends RuntimeException {
	InvalidNameException () {
		super();
	}
	InvalidNameException (String msg) {
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