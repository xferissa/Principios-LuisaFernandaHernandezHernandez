

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
	Producto p = new Producto("Cumbres borrascosas",289,3);
	System.out.println("Nombre: "+p.getNombre());
	System.out.println("Precio: "+p.getPrecio());
	System.out.println("Stock: "+p.getStock());
	p.vender(2);
	System.out.println("Stock: "+p.getStock());
  }


}
