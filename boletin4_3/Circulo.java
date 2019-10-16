/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author usuario
 */
public class Circulo {
    private double radio;
    final double Pi=3.14;

    public Circulo(){
    // constructor vacío
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        return Pi*Math.pow(radio, 2);
    }
    public double calcularLonxitude(){
        return 2*Pi*radio;
    }

}
