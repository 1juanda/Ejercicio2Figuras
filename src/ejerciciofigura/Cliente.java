/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofigura;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Punto;
import figuras.Rectangulo;
import java.util.Scanner;


/**
 *
 * @author estudiantes
 */
public class Cliente {

    /** Método que recibe los valores de los parámetros de entrada 
     * @param P1,P2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double x1=0, y1=0, x2=0, y2=0, radio=0, lado=0, baseRec=0, alturaRec=0;
        Punto pUno = new Punto(x1,y1); 
        Punto pDos = new Punto(x2,y2);
        Circulo circ = new Circulo (radio);
        Cuadrado square = new Cuadrado (lado);
        Rectangulo rectangle = new Rectangulo(baseRec, alturaRec);
        
        System.out.println("Ingrese el valor x del primer punto:");
        x1 = sc.nextDouble();
        System.out.println("Ingrese el valor y del primer punto:");
        y1 = sc.nextDouble();
        
        System.out.println("Ingrese el valor x del segundo punto:");
        x2 = sc.nextDouble();
        System.out.println("Ingrese el valor y del segundo punto:");
        y2 = sc.nextDouble();
        
        pUno.setX(x1);
        pUno.setY(y1);
        pDos.setX(x2);
        pDos.setY(y2);
        
        pUno.calcularDistancia(pDos);
        System.out.println("Distancia: " + pUno.calcularDistancia(pDos));
        
        radio=pUno.calcularDistancia(pDos);
        circ.setRadio(radio);
        System.out.println("Area circulo: "+ circ.calcularArea());
        System.out.println("perimetro circulo: "+ circ.calcularPerimetro());
        
        lado=pUno.calcularDistancia(pDos);
        square.setLado(lado);
        System.out.println("Area cuadrado: "+ square.calcularArea());
        System.out.println("perimetro cuadrado: "+ square.calcularPerimetro());
        
        baseRec = pUno.getX() - pDos.getX();
        alturaRec = pUno.getY() - pDos.getY();
        
        rectangle.setAltura(alturaRec);
        rectangle.setBase(baseRec);
        System.out.println("Area rectangulo: " + rectangle.calcularArea());
        System.out.println("Perimetro rectangulo: " + rectangle.calcularPerimetro());
    }
    
}
