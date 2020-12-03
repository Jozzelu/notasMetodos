/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package notasmetodos;

import java.util.Scanner;

/**
 *
 * @author Jozzelu
 */
public class NotasMetodos {
    
    public static String mostrarNota(float nota){
        String resultado="";
        if (nota <= 4.9) {
            resultado=("La calificación obtenida es: Suspenso");}
        else if (nota <= 5.9) {
            resultado=("La calificación obtenida es: Aprobado");}
        else if (nota <= 6.9) {
            resultado=("La calificación obtenida es: Bien");}
        else if (nota <= 8.9) {
            resultado=("La calificación obtenida es: Notable");}
        else {
            resultado=("La calificación obtenida es: Sobresaliente");
        }
        return resultado;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float nota = 0F;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime tu nota en números (de 0 a 10)");
        nota = teclado.nextFloat();
        while (nota<0 || nota>10){
            System.out.println("Recuerda que tiene que ser entre 0 y 10 (incluidos)");
            System.out.println("Dime de nuevo la nota");
            nota = teclado.nextFloat();
        }
        System.out.println(mostrarNota(nota));
    }
}
