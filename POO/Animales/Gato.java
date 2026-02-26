

/**
 * Class Gatos
 */
public class Gato extends Animal implements Sonido {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Gato (String nombre) {
	super(nombre);
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
   */

  /**
   */
  @Override
  public void hacerSonido()
  {
	System.out.println("Miau");
  }

  @Override
  public void mover()
  {
	System.out.println("El gato salta");
  }


  /**
   */
  public void hacerSonido()
  {
  }


}
