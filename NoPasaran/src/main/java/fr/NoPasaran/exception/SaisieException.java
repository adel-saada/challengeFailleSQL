package fr.NoPasaran.exception;

public class SaisieException extends Exception {
	

	private static final long serialVersionUID = 1L;
	
	public SaisieException() {
		super();
	}

	public SaisieException( String message ) {
        super( message );
    }

}