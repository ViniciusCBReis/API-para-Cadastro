package api.caduser.exception;

public class UsuarioResourceException extends Exception {
     
    public UsuarioResourceException(){
        super();
    }

    public UsuarioResourceException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public UsuarioResourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public UsuarioResourceException(String message) {
    super(message);
  }

  public UsuarioResourceException(Throwable cause) {
    super(cause);
  }
        
}
