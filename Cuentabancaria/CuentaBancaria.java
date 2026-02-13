

/**
 * Class CuentaBancaria
 */
public class CuentaBancaria {

  //
  // Fields
  //

  private double saldo;
  
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
   * @param        saldo1
   */
  public CuentaBancaria(double saldo1)
  {
	this.saldo = saldo1;
	System.out.println("Saldo inicial = $"+saldo1);
  }


  /**
   * @return       double
   */
  public double getSaldo()
  {
	return this.saldo;
  }


  /**
   * @param        deposito
   */
  public void depositar(double deposito)
  {
	saldo += deposito;
	System.out.println("deposito = "+deposito);
  }


  /**
   * @param        monto
   */
  public void retirar(double monto)
  {
	System.out.println("Retitando "+monto);
	if(this.saldo<1){
		System.out.println("Fondo insuficiente...");
	}else{
		this.saldo -=monto;
		System.out.println("retiro = "+monto);
	}
  }


}
