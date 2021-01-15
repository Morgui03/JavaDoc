package cursojava;
/**
 * Clase CursoJava
 * 
 * @author Morgana
 * @version 1.0
 */
public class Cursojava {
        /**
        * Clase Empleado que hace referencia a la clase Persona
        */
        public class Empleado extends Persona{
        /**
        * @param numeroEmpleado define el numero del empleado
        * @param departamento define el departamento del empleado
        * @param puesto define el puesto del empleado
        */
        private int numeroEmpleado;
        private String departamento;
        private String puesto;
        // Constructor
        /**
        * Constructor Empleado que se inicializa con parámetros.
        * 
        * @param nombre
        * @param edad
        * @param sexo 
        * @param numeroEmpleado
        * @param departamento
        * @param puesto
        */         
        public Empleado(String nombre,
            int edad,
            char sexo,
            int numeroEmpleado,
            String departamento,
            String puesto){ 
                // Constructor
                /**
                 * Constructor super, que se inicializa con parámetros.
                 * y hace referencia al anterior.
                 * 
                 * @param nombre
                 * @param edad
                 * @param sexo 
                 */ 
                super(nombre, edad, sexo);                         
                    this.numeroEmpleado = numeroEmpleado;
                    this.departamento = departamento;
                    this.puesto = puesto;
        }
        // Constructor
        /**
        * @return devuelve el numero de empleado.
        */
        public int getNumeroEmpleado() {

            return numeroEmpleado;
        }
        // Constructor
        /**
         * Constructor con un parámetro
         */
        public void setNumeroEmpleado(int numeroEmpleado) {

            this.numeroEmpleado = numeroEmpleado;
        }
        // Constructor
        /**
        * @return devuelve el departamento del empleado.
        */
        public String getDepartamento() {

            return departamento;
        }
        // Constructor
        /**
         * Constructor con un parámetro
         */
        public void setDepartamento(String departamento) {

            this.departamento = departamento;
        }
        // Método público
        /**
        * @return devuelve el puesto del empleado.
        */
        public String getPuesto() {

            return puesto;
        }
        // Método público
        /**
         * Método con un parámetro
         */
        public void setPuesto(String puesto) {

            this.puesto = puesto;
        }
    }
}
    
