

/**
 * Class EjecutaObjetos
 */
public class EjecutaObjetos {

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
	Pelota p1 = new Pelota("Circular", "Azul", "Plastico","Normal");
	p1.botar();
	p1.desinflar();
	Pelota p2 = new Pelota("Circular", "Azul", "Piel", "Deportiva");
	p2.botar();
	p2.desinflar();
  }


}
