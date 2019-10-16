/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author usuario
 */
public class Conta {
   
    String miguel;
    String numeroCuenta;
    double tipoInteres;
    double saldo;
        
    //Constructores
    public Conta (String migui,String numCuenta, double tipInteres, double sald){
        
        miguel=migui;
        numeroCuenta=numCuenta;  
        tipoInteres  =tipInteres;
        saldo=sald;
    }
    
    //Setters
    
    public void setNombre(String migui){
        miguel=migui;
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
        String Cuenta=numeroCuenta;
        return Cuenta;
    }
    public String getNombre(){
       return  miguel;
    }  
    public double getInteres(){
       return tipoInteres;
    }
    public double getSueldo(){
       return saldo;
    }
    
    
    public double ingreso(){
        double ingreso=saldo;
        return ingreso;
    }
}
