

/**
 * Class Estudiante
 */
public class Estudiante extends Persona {

  //
  // Fields
  //

  public String Matricula;
  public double Promedio;
  public String Licenciatura;
  
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
   * Set the value of Matricula
   * @param newVar the new value of Matricula
   */
  public void setMatricula (String newVar) {
    Matricula = newVar;
  }

  /**
   * Get the value of Matricula
   * @return the value of Matricula
   */
  public String getMatricula () {
    return Matricula;
  }

  /**
   * Set the value of Promedio
   * @param newVar the new value of Promedio
   */
  public void setPromedio (double newVar) {
    Promedio = newVar;
  }

  /**
   * Get the value of Promedio
   * @return the value of Promedio
   */
  public double getPromedio () {
    return Promedio;
  }

  /**
   * Set the value of Licenciatura
   * @param newVar the new value of Licenciatura
   */
  public void setLicenciatura (String newVar) {
    Licenciatura = newVar;
  }

  /**
   * Get the value of Licenciatura
   * @return the value of Licenciatura
   */
  public String getLicenciatura () {
    return Licenciatura;
  }

  //
  // Other methods
  //

  /**
   */
  public Estudiante(String nombre, int edad, String sexo, String matricula, double promedio, String licenciatura){
	super(nombre, edad, sexo);
	this.Matricula=matricula;
	this.Promedio=promedio;
	this.Licenciatura=licenciatura;
  }
  public void DatosDeAlumno()
  {
	super.MostrarDatos();
	System.out.println("Datos del alumno:\n > Matricula: "+Matricula+"\n > Promedio: "+Promedio+"\n > Licenciatura: "+Licenciatura);
  }


}
