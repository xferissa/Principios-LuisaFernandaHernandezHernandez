

/**
 * Class SistemaAlertas
 */
public class SistemaAlertas {

  //
  // Fields
  //

  
  //
  // Constructors
  //
    
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * @param        args
   */
  public static void main(String[] args)
  {
	EmailNotificacion email = new EmailNotificacion("Bienvenido!", "user@gmail.com");
	email.enviar();
	email.registrarLog();

	SMSNotificacion sms = new SMSNotificacion("Tu codigo es 12345", "522727342");
	sms.enviar();
	sms.registrarLog();
  }


}
