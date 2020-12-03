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
    
    public static void mostrarNota(float nota){
        
        if (nota <= 4.9) {
            System.out.println("La calificación obtenida es: Suspenso");}
        else if (nota <= 5.9) {
            System.out.println("La calificación obtenida es: Aprobado");}
        else if (nota <= 6.9) {
            System.out.println("La calificación obtenida es: Bien");}
        else if (nota <= 8.9) {
            System.out.println("La calificación obtenida es: Notable");}
        else {
            System.out.println("La calificación obtenida es: Sobresaliente");
        }
    }
    
    public static void convertirEuros(String divisa){
        float euros = 0F;
        float resultado = 0F;
        Scanner teclado = new Scanner(System.in);
        euros=teclado.nextFloat();
        
        System.out.println("Introduce la divisa a la que quieres hacer la conversión (libras, dolares o yenes)");
        divisa=teclado.next();
        divisa=divisa.toLowerCase();
        if (divisa.equals("libras")) {
            float libras=1.2F;
            resultado=(euros*libras);
            System.out.println("El cambio de "+euros+"€ a libras es de "+resultado+("£"));;
        }
        else if (divisa.equals("dolares")) {
            float dolares=1.3F;
            resultado=(euros*dolares);
            System.out.println("El cambio de "+euros+"€ a dólares es de "+resultado+("$"));;
        }
        else if (divisa.equals("yenes")) {
            float yenes = 0.89F;
            resultado=(euros*yenes);
            System.out.println("El cambio de "+euros+"€ a yenes es de "+resultado+("¥"));
        }
        else {
            System.out.println("No has introducido bien la divisa");
        }
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
        mostrarNota(nota);
        
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        String divisa="";
        
        System.out.println("Introduce un número de euros");
        convertirEuros(divisa);
    }
}
