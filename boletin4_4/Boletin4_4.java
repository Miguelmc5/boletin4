package boletin4_4;

/**
 *
 * @author usuario
 */
public class Boletin4_4 {

    
    public static void main(String[] args) {
        
        Conta miCuenta=new Conta("Miguel" , "7650608", 0.9, 300.8);
        
        System.out.println("La cantidad inicial en la cuenta es: "+miCuenta.getSueldo());
        
        miCuenta.ingreso(564.89);
        System.out.println("La cuenta después de ingresar queda con: "+miCuenta.getSueldo());
        
        miCuenta.reintegro(-28.7);
        System.out.println("La cuenta después de la retirada queda con: "+miCuenta.getSueldo());
    
        Conta miCuenta2=new Conta ("Aida", "7204551", 0.9, 245834);
        
        System.out.println("Antes de tranferir las cuentas tienen: \n miCuenta: "+miCuenta.getSueldo()+" \n miCuenta2: "+miCuenta2.getSueldo());
        
        miCuenta.transferenciaIngresar(miCuenta2, 230.56);
        miCuenta.transferenciaDescontar(miCuenta, 230.56);
        System.out.println("Después de la transferencia las cuentas quedan con: \n miCuenta: "+miCuenta.getSueldo()+" \n miCuenta2: "+miCuenta2.getSueldo());
        
    }
    
}
