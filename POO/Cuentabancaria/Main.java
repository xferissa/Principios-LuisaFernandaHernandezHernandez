

/**
 * Class Main
 */
public class Main {

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
	CuentaBancaria cb = new CuentaBancaria(1000);
	cb.depositar(500);
	cb.retirar(1500);
	System.out.println("Saldo actual: "+cb.getSaldo());
	cb.retirar(100);
  }


}
