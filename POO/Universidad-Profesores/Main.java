import java.util.*;

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
	Profesor p1 = new Profesor("adsoftdito", "principios");
	Profesor p2 = new Profesor("gabriel", "IA");
	List<Profesor> listaProfesores = new ArrayList<>();
	listaProfesores.add(p1);
	listaProfesores.add(p2);

	Universidad universidad = new Universidad("USBI", listaProfesores);
	
	universidad.mostrarProfesores();
  }


}
