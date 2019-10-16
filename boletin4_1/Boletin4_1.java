package boletin4_1;

/**
 *
 * @author mmartinezcosta
 */

import java.util.*;

public class Boletin4_1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
         Scanner sc=new Scanner(System.in);
    int velocidadActual;
         Coche cochito= new Coche();
    cochito.mostrar();
        System.out.println("La velocidad actual es:");
     velocidadActual=sc.nextInt();
     cochito.acelerar(velocidadActual);
        System.out.println("Acelera: "+cochito.getVelocidade());
     
        System.out.println("La velocidad actual es:");
     velocidadActual=sc.nextInt();
     cochito.frenar(velocidadActual);
        System.out.println("Frena hasta: "+cochito.getVelocidade());
    }
}
