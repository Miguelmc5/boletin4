package boletin4_1;

/**
 *
 * @author usuario
 */
public class Coche {
    
    private int velocidade ;
   
      
    public Coche(){
    velocidade=0 ;
}
   
    public int getVelocidade() {
        return velocidade;
}    
    public void acelerar (int valor){
        velocidade=velocidade+valor;
}
    
    public void frenar (int menos){
        velocidade=velocidade-menos;
}
    
    public void mostrar(){
    System.out.println("La velocidad inicial es: "+velocidade+".");
}
    
    
   } 

