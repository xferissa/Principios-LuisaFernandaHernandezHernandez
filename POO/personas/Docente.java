

/**
 * Class Docente
 */
public class Docente extends Persona {

  //
  // Fields
  //

  public String IdTrabajador;
  public double Salario;
  public String Departamento;
  
  //
  // Constructors
  //
  public Docente (String nombre, int edad, String sexo, String id,double salario, String departamento) {
	super(nombre, edad, sexo);
	this.IdTrabajador=id;
	this.Salario=salario;
	this.Departamento=departamento;
   };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of IdTrabajador
   * @param newVar the new value of IdTrabajador
   */
  public void setIdTrabajador (String newVar) {
    IdTrabajador = newVar;
  }

  /**
   * Get the value of IdTrabajador
   * @return the value of IdTrabajador
   */
  public String getIdTrabajador () {
    return IdTrabajador;
  }

  /**
   * Set the value of Salario
   * @param newVar the new value of Salario
   */
  public void setSalario (double newVar) {
    Salario = newVar;
  }

  /**
   * Get the value of Salario
   * @return the value of Salario
   */
  public double getSalario () {
    return Salario;
  }

  /**
   * Set the value of Departamento
   * @param newVar the new value of Departamento
   */
  public void setDepartamento (String newVar) {
    Departamento = newVar;
  }

  /**
   * Get the value of Departamento
   * @return the value of Departamento
   */
  public String getDepartamento () {
    return Departamento;
  }

  //
  // Other methods
  //

  /**
   */
  public void DatosDocente()
  {
	super.MostrarDatos();
	System.out.println("Datos del Docente:\n > ID trabajador: "+IdTrabajador+"\n > Salario: "+Salario+"\n > Departamento: "+Departamento);
  }


}
