/**
   PAGINA 18
   EJERCICIO 7. 
 * Diseña un algoritmo que nos indique si podemos salir a la calle. 
 
 * Existen aspectos que influirán en esta decisión: si está lloviendo y si 
   hemos terminado nuestras tareas. Solo podremos salir a la calle si no está 
   lloviendo y hemos finalizado nuestras tareas. 
 
 * Existe una opción en la que, indistintamente de lo anterior, podremos salir 
   a la calle: el hecho de que tengamos que ir a la biblioteca. Solicitar al 
   usuario mediante booleano si llueve, si ha finalizado las tareas y si 
   necesita ir a la biblioteca. El algoritmo debe mostrar mediante booleano si 
   es posible que se le otorgue el permiso de salir a la calle.
 
   @author Daw120
 */
package com.solomongo.ejercicio7_daw120;
import java.util.Scanner;
public class Ejercicio7_DAW120 {
    public static void main(String[] args) {       
    Scanner teclado = new Scanner(System.in); // Crea objeto teclado 
      
    boolean tareaResult; 
    boolean llueveResult; 
    boolean biblioResult; 
    String salidaRespuesta;
    boolean salidaResult;
    String tareaResultOK; 
    String llueveResultOK; 
    String biblioResultOK;
      
        System.out.println("\nTarea hecha?: ");     
          tareaResult=teclado.nextBoolean(); 
          tareaResultOK=tareaResult==false? "Sin hacer.." : "Realizada.";
         System.out.print("Tu tarea esta: "+tareaResultOK+"\n"); 
         
        System.out.println("\nEsta lloviendo?: ");
          llueveResult=teclado.nextBoolean(); 
          llueveResultOK=llueveResult==false? "Sin llover." : "Lloviendo..";
        System.out.print("Esta: "+llueveResultOK+"\n"); 

        System.out.println("\nVas Biblioteca?: ");
          biblioResult=teclado.nextBoolean(); 
          biblioResultOK=biblioResult==false? "No voy." : "Si ire..";
        System.out.print("Acudes a la biblio: "+biblioResultOK+"\n"); 

        salidaResult= tareaResult==false && llueveResult==true || biblioResult==true;
        salidaRespuesta= salidaResult==true ? "- Si puedes salir" : "- No puedes salir.";
        System.out.println("\n\t- Puedo salir?:\n\t"+salidaRespuesta+"\n");
        }
}
