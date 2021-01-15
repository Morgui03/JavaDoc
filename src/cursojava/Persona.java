package cursojava;
/**
 * Clase Persona, contiene un constructor
 * @author Morgana
 * @version 1.0
 */
class Persona {
    /**
     * @param nombre define el nombre del empleado
     * @param edad define la edad del empleado
     * @param sexo define el sexo del empleado
     */
        String nombre;
        int edad;
        char sexo;
    // Constructor
    /**
     * Constructor que se inicializa con parámetros.
     * 
     * @param nombre
     * @param edad
     * @param sexo 
     */    
    Persona(String nombre, int edad, char sexo) {
      this.nombre = nombre;
      this.edad = edad;
      this.sexo = sexo;
    }
   
}
