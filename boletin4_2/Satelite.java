package boletin4_2;

/**
 *
 * @author usuario
 */
public class Satelite {
   
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;

public Satelite (){
    meridiano=paralelo=distanciaTierra=0;
}
public Satelite(double m, double p, double d){
    meridiano = m ;
    paralelo = p;
    distanciaTierra = d ;
}
public void verPosicion ( ) {
    System.out.println("O satelite atopase no paralelo: "  +paralelo+ " meridiano: " +meridiano+ " a unha distancia da terra: " + distanciaTierra );
}
    }



