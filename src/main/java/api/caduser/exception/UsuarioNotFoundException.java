package api.caduser.exception;

public class UsuarioNotFoundException extends Exception{
    
    public UsuarioNotFoundException() {
        super();
      }
    
      public UsuarioNotFoundException(String message, Throwable cause, boolean enableSuppression,
          boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
      }
    
      public UsuarioNotFoundException(String message, Throwable cause) {
        super(message, cause);
      }
    
      public UsuarioNotFoundException(String message) {
        super(message);
      }
    
      public UsuarioNotFoundException(Throwable cause) {
        super(cause);
      }

}

