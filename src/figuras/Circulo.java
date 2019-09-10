/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import ejerciciofigura.Figura;

/**
 * Clase para calcular el área y perimetro del círculo
 * params radio
 * @author estudiantes
 */
public class Circulo implements Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    /* Método que calcula el área del circulo
    *  return area; 
    */
    public double calcularArea(){
        double area = Math.PI*(Math.pow(this.radio,2));
        
        return area;
    }
    /* Método que calcula el perimetro del circulo
    *  return perimetro; 
    */
    public double calcularPerimetro(){
        double perimetro = 2*Math.PI*this.radio;
        
        return perimetro;
    }
    
}
