/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import ejerciciofigura.Figura;

/** Método para calcular area y perímétro
 *  params lado;
 * @author estudiantes
 */
public class Cuadrado implements Figura {
    
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
     /*Método para calcular area
    * return area;
    */
    public double calcularArea(){
        double area = lado * lado;
        
        return area;
    }
    /*Método para calcular perímetro
    * return perimetro;
    */
    public double calcularPerimetro(){
        double perimetro = 4 * lado;
        
        return perimetro;
    }
    
}
