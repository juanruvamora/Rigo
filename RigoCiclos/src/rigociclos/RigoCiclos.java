/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rigociclos;
 import clases.alumno; // se importa para mandar llamar a la clase alumno
import java.util.Scanner;

public class RigoCiclos {

     static int menu;
     static Scanner leer = new Scanner(System.in);// leeer lo que el usuario ingresa (leer)
    static int numCal; // variable numero de calificaciones
    static double sumCal=0;// variable suma de calificiaciones
    static double cal;// suma de calificacion individual
    static double prom; // variable para almacenar el promedio
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        alumno objeto = new alumno("", "", 0,0); // crea el objeto instancia 
        
        System.out.println("Escuela de Rigo");// imprime en consola
        do{ // es un ciclo que se hace una vez y se repite mientras el while se cumpla
        System.out.println("Menu (1) Ingresa calificaciones (2) promedia (3) salir ");
        menu=leer.nextInt();// con esto lees lo que ingresa el usuario en consola
        switch(menu) // es donde como un menu 
                {
                    case 1:
                        do{                     
                        System.out.println("Ingresa el numero de calificaciones entre 1 y 10");
                    numCal= leer.nextInt(); // lee lo que el ingresa el usuario
                        }while(numCal<0||numCal>10);// se valida que ingresen entre 1 y 10
                        for (int i = 0; i < numCal; i++) {// es un ciclo finito para preguntar algo
                            System.out.println("Ingresa la calificacion"+(i+1));
                            cal=leer.nextDouble();// ingreso la primera calificacion
                            sumCal=cal+sumCal;// con esto suma calificacion con la suma antetior de las calificaciones
                            // se repote hasta i sea igual al numero de calificaciones al inicio                      
                            
                        }
                    break;
                    
                    case 2: System.out.println("Promedia materias");
                    prom=objeto.promedio(numCal, sumCal);// las variables se asignan con el igual
                    // se usa el objeto para mandar llamar el metodo alumno
                        System.out.println("Tu promedio es "+prom);
                        if(prom==100){// es una condicion si se cumple entra y te muestra el mensaje
                            System.out.println("Eres muy listo");
                        }
                        if(prom>=80&&prom<=99){
                            System.out.println("Eres Sobresaliente");
                                                   }
                        if(prom>=60&&prom<=79){
                            System.out.println("Apenas pasaste");
                                                   }
                         if(prom<60){
                            System.out.println("Reprobaste");
                        }   
                    break;
                    
                    case 3: System.out.println("se esta saliendo");
                    System.exit(0);
                    break;
                }
        }while(menu!=3);// adentro se pone la condicion = hasta que se seleccione 3 se sale del do While
    
    }
        
}
