package exceptions;

public class BrawlStarConnectionException extends Exception {
	private static final long serialVersionUID = -4117087593144692873L;

	public BrawlStarConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public BrawlStarConnectionException(String message, int reason) {
		super(message);
	}
	

}
