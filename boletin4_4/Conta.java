package boletin4_4;

/**
 *
 * @author usuario
 */
public class Conta {
   
    String nome;
    String numeroCuenta;
    double tipoInteres;
    double saldo;
        
    //Constructores
    public Conta (String nom,String numCuenta, double tipInteres, double sald){
        
        nome=nom;
        numeroCuenta=numCuenta;  
        tipoInteres  =tipInteres;
        saldo=sald;
    }
    
    //Setters
    
    public void setNombre(String nom){
        nome=nom;
    }
    public void setCuenta(String numCuenta){
        numeroCuenta=numCuenta;
    }
    public void setInteres(double tipInteres){
        tipoInteres=tipInteres;
    }
    public void setSueldo(double sald){
        saldo=sald;
    }
    
    //Gettters 
    
    public String getCuenta(){
        return numeroCuenta;
    }
    public String getNombre(){
       return  nome;
    }  
    public double getInteres(){
       return tipoInteres;
    }
    public double getSueldo(){
       return saldo;
    }
    
    // Ingreso
    public void ingreso(double cantidad){
        saldo+=cantidad;
    }
    
    // Reintegro
    public void reintegro(double cantidad){
        saldo -= Math.abs(cantidad);       
    }
    
    // Transferencia
    public void transferenciaIngresar(Conta destino, double cantidad){
        destino.setSueldo(destino.getSueldo() + cantidad);
    }
    public void transferenciaDescontar(Conta origen, double cantidad){
        origen.setSueldo(origen.getSueldo() - cantidad);
    }
}
