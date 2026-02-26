

/**
 * Class Avion
 */
public class Avion {

  //
  // Fields
  //

  public String aerolinea;
  public String cantidad_de_motores;
  protected String velocidad;
  private String capacidad;
  
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
   * @param        aerolinea1
   * @param        cantidad1
   * @param        valocidad1
   * @param        capacidad1
   */
  public Avion(String aerolinea1, String cantidaddemotores, String velocidad1, String capacidad1)
  {
	this.aerolinea=aerolinea1;
	this.cantidad_de_motores=cantidaddemotores;
	this.velocidad=velocidad1;
	this.capacidad=capacidad1;
	System.out.println("Construyo un avion");
  }


  /**
   */
  public void acelerar()
  {
	System.out.println("El avion acelero");
  }


  /**
   */
  public void elevarse()
  {
	System.out.println("El avion se elevo");
  }


  /**
   * @param        modelo1
   */
  

  /**
   * @return       String
   */
  
}
