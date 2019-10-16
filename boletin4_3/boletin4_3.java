package boletin4_3;

/**
 *
 * @author usuario
 */
public class boletin4_3 {

    
    public static void main(String[] args) {
        
        Circulo tapa=new Circulo(6.9);
        
        System.out.println("El área de una tapa es de: "+Math.round(tapa.calcularArea())+" mm");
        System.out.println("La longitud de una tapa es de: "+Math.round(tapa.calcularLonxitude())+" mm");
    }
    
}
