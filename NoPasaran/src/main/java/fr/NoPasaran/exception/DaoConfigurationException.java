package fr.NoPasaran.exception;

public class DaoConfigurationException extends RuntimeException {

    private static final long serialVersionUID = 9164530242774772495L;

    public DaoConfigurationException( String message ) {
        super( message );
    }

    public DaoConfigurationException( String message, Throwable cause ) {
        super( message, cause );
    }

    public DaoConfigurationException( Throwable cause ) {
        super( cause );
    }
}