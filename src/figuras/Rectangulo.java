/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import ejerciciofigura.Figura;

/** Método para calcular area y perímétro
 *  params altura, base;
 * @author estudiantes
 */
public class Rectangulo implements Figura {
    
    double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     /*Método para calcular area
    * return area;
    */
    public double calcularArea(){
        double area = base * altura;
        
        return area;
    }
     /*Método para calcular perímetro
    * return perimetro;
    */
    public double calcularPerimetro(){
        double perimetro = (2*base)+(2*altura);
        
        return perimetro;
    }
}
