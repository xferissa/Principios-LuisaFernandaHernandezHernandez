

/**
 * Class Vehiculo
 */
public class Vehiculo {

  //
  // Fields
  //

  protected int precioDia;
  protected String marcaModelo;
  protected int numllantas;
  
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
   * Set the value of PrecioDia
   * @param newVar the new value of PrecioDia
   */
  public void setPrecioDia (int newVar) {
    precioDia = newVar;
  }

  /**
   * Get the value of PrecioDia
   * @return the value of PrecioDia
   */
  public int getPrecioDia () {
    return precioDia;
  }

  /**
   * Set the value of marcaModelo
   * @param newVar the new value of marcaModelo
   */
  public void setMarcaModelo (String newVar) {
    marcaModelo = newVar;
  }

  /**
   * Get the value of marcaModelo
   * @return the value of marcaModelo
   */
  public String getMarcaModelo () {
    return marcaModelo;
  }

  /**
   * Set the value of numllantas
   * @param newVar the new value of numllantas
   */
  public void setNumllantas (int newVar) {
    numllantas = newVar;
  }

  /**
   * Get the value of numllantas
   * @return the value of numllantas
   */
  public int getNumllantas () {
    return numllantas;
  }

  //
  // Other methods
  //

  /**
   */

  public Vehiculo(String marca, int precio,int llantas){
	this.marcaModelo=marca;
	this.precioDia=precio;
	this.numllantas=llantas;
  }
  public void mostrarCaracteristicas()
  {
	System.out.println("Caracteristicas:\n > Precio: "+precioDia+"\n > Marca: "+marcaModelo+"\n > Numero de llantas: "+numllantas);
  }


  /**
   */
  public void encenderMotor()
  {
	System.out.println("Motor encendido");
  }


  /**
   */
  public void apagarMotor()
  {
	System.out.println("Motor apagado");
  }


  /**
   */
  public void funciona()
  {
	System.out.println("Funcionar...");
  }


}
