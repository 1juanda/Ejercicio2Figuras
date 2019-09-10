/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/** Clase para calcular la distancia
 * params x,y
 *
 * @author estudiantes
 */
public class Punto  {
    
    double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    /** Método que calcula la distancia
    *return distancia;
    */
    public double calcularDistancia(Punto p){
        double distancia = 0;
        if (x>=0 && y>=0 ) {
          distancia=Math.sqrt(Math.pow(this.x- p.x,2) + Math.pow(this.y-p.y,2));
        }
        return distancia;
    }
    
}
