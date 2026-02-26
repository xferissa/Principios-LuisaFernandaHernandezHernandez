

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
	Estudiante e1 = new Estudiante("Luisa", 20, "Mujer","sz24003928",98, "Ing. de Software");
	e1.DatosDeAlumno();

	Estudiante e2 = new Estudiante("Fernanda", 20, "Mujer", "zs24003928", 98, "Ing de Software");
	e2.DatosDeAlumno();

	Estudiante e3 = new Estudiante("Ramses", 21, "Hombre", "zs24003929", 70.7, "Mecanica");
	e3.DatosDeAlumno();

	Docente d1 = new Docente("Fernando", 21, "Hombre", "AAA", 7000, "Ingenieria");
	d1.DatosDocente();

	Docente d2 = new Docente("Rodriguez", 21, "Hombre", "AAB", 6000, "Psicologia");
	d2.DatosDocente();

	Docente d3 = new Docente("Zarate", 21, "Hombre", "ABB", 8000, "Literatura");
	d3.DatosDocente();
  }


}
