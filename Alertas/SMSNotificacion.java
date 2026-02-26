
import java.util.*;


/**
 * Class SMSNotificacion
 */
public class SMSNotificacion extends Notificacion implements Envia {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public SMSNotificacion (String mensaje, String destinatario) {
	super(mensaje,destinatario);
  };
  
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
   * @param        nombre
   * @param        destinatario
   */
  
  /**
   */
  @Override
  public void enviar()
  {
	System.out.println("Enviando SMS al numero +"+destinatario+"[Costo: $0.0]");
  }

  @Override
  public void registrarLog(){
	System.out.println("Log: Modificacion creada para +"+destinatario);
  }

}
