

/**
 * Class Producto
 */
public class Producto {

  //
  // Fields
  //

  private String nombre;
  private double precio;
  private int stock;
  
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
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of precio
   * @param newVar the new value of precio
   */
  public void setPrecio (double newVar) {
    precio = newVar;
  }

  /**
   * Get the value of precio
   * @return the value of precio
   */
  public double getPrecio () {
    return precio;
  }

  /**
   * Set the value of stock
   * @param newVar the new value of stock
   */
  public void setStock (int newVar) {
    stock = newVar;
  }

  /**
   * Get the value of stock
   * @return the value of stock
   */
  public int getStock () {
    return stock;
  }

  //
  // Other methods
  //

  /**
   * @param        nombre
   * @param        precio
   * @param        stock
   */
  public Producto(String nombre, double precio, int stock)
  {
	this.nombre=nombre;
	this.precio=precio;
	this.stock=stock;
  }


  /**
   * @return       String
   */
  

  /**
   * @return       double
   */
  

  /**
   * @return       int
   */
  

  /**
   * @param        cantidad
   */
  public void vender(int cantidad)
  {
	if(cantidad>stock){
		System.out.println("No hay stock suficiente");
	}else{
		stock-=cantidad;
		System.out.println("Venta realizada");
	}
  }


}
