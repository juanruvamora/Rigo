/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class alumno {
    
    public String nombre; // creo y nombro las variables que se van a conectar entre si
            public String apellido;
            public int numMaterias;
            public double califa;

            // el constructor se usa para mandar llamar todo lo que esta en la clase y se genera con clic derecho y constructor
    public alumno(String nombre, String apellido, int numMaterias, double califa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numMaterias = numMaterias;
        this.califa = califa;
    }

            
            
           //  los getter y setter es para mostrar los nombres que ya nombraste con anterioridad
    public String getNombre() {
        return nombre; // regresa elnombre de la clase
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // recibe el nombre del main y lo inserta en la variable de la clase (nombre)
        // this es= la variable de nombre de esa clase 
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public double getCalifa() {
        return califa;
    }

    public void setCalifa(double califa) {
        this.califa = califa;
    }
            
       // necesitas pensar un metodo que es el problema
 
    
    public double promedio(int numCal, double numTot){ // se crea el metodo para realizar el promedio
        double promedio; // creamos esta variable unica para que me regrese promedio
        promedio = numTot/numCal;// promedio = numero de calificacion entre numero total
        return promedio; // regresa la variable que es promedio
    }
            
    
    
}
