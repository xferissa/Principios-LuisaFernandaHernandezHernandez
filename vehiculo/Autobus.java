

/**
 * Class Autobus
 */
public class Autobus extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  private int numPuertas;
  private int numVentanillas;
  
  //
  // Constructors
  //
    
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numAsientos
   * @param newVar the new value of numAsientos
   */
  public void setNumAsientos (int newVar) {
    numAsientos = newVar;
  }

  /**
   * Get the value of numAsientos
   * @return the value of numAsientos
   */
  public int getNumAsientos () {
    return numAsientos;
  }

  /**
   * Set the value of numPuertas
   * @param newVar the new value of numPuertas
   */
  public void setNumPuertas (int newVar) {
    numPuertas = newVar;
  }

  /**
   * Get the value of numPuertas
   * @return the value of numPuertas
   */
  public int getNumPuertas () {
    return numPuertas;
  }

  /**
   * Set the value of numVentanillas
   * @param newVar the new value of numVentanillas
   */
  public void setNumVentanillas (int newVar) {
    numVentanillas = newVar;
  }

  /**
   * Get the value of numVentanillas
   * @return the value of numVentanillas
   */
  public int getNumVentanillas () {
    return numVentanillas;
  }

  //
  // Other methods
  //

  /**
   */
  public Autobus(String marca, int precio, int llantas, int asientos, int puertas, int ventanillas)
  {
	super(marca,precio,llantas);
	this.numAsientos=asientos;
	this.numPuertas=puertas;
	this.numVentanillas=ventanillas;
  }
  public void mostrarDatos()
  {
	super.mostrarCaracteristicas();
	System.out.println(" > Numero de Asientos: "+numAsientos+"\n > Numero de puertas: "+numPuertas+"\n Numero de ventanillas: "+numVentanillas);
  }

  /**
   */
  public void pruebaDelMotor()
  {
	System.out.println("Prueba del motor");
	super.encenderMotor();
	super.apagarMotor();
	super.funciona();
  }

}
