

/**
 * Class Television
 */
public class Television {

  //
  // Fields
  //

  public String forma;
  public String calidad_de_video;
  protected String marca;
  private String tama_o;
  
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
   * Set the value of forma
   * @param newVar the new value of forma
   */
  public void setForma (String newVar) {
    forma = newVar;
  }

  /**
   * Get the value of forma
   * @return the value of forma
   */
  public String getForma () {
    return forma;
  }

  /**
   * Set the value of calidad_de_video
   * @param newVar the new value of calidad_de_video
   */
  public void setCalidad_de_video (String newVar) {
    calidad_de_video = newVar;
  }

  /**
   * Get the value of calidad_de_video
   * @return the value of calidad_de_video
   */
  public String getCalidad_de_video () {
    return calidad_de_video;
  }

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    marca = newVar;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of tama_o
   * @param newVar the new value of tama_o
   */
  public void setTama_o (String newVar) {
    tama_o = newVar;
  }

  /**
   * Get the value of tama_o
   * @return the value of tama_o
   */
  public String getTama_o () {
    return tama_o;
  }

  //
  // Other methods
  //

  /**
   * @param        forma1
   * @param        tama_o1
   * @param        calidaddevideo1
   * @param        marca
   */
  public Television(String forma1, String tama_o1, String calidaddevideo1, String marca)
  {
	this.forma = forma1;
	this.tama_o = tama_o1;
	this.calidad_de_video = calidaddevideo1;
	this.marca = marca;
	System.out.println("Construyo una television");
  }


  /**
   */
  public void apagada()
  {
	System.out.println("Television apagada");
  }


  /**
   */
  public void prendida()
  {
	System.out.println("Television encendida");
  }


  /**
   * @param        forma1
   */


  /**
   * @return       String
   */


}
