/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author usuario
 */
public class Euler {

    double x,//valor inicial X
            y,//Valor inicial Y
            xf;// desde cero hasta xf        

    public Euler(double x, double y, double xf) {
        this.x = x;
        this.y = y;
        this.xf = xf;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x0) {
        this.x = x0;
    }

    public double getY() {
        return y;
    }

    public void setY(double y0) {
        this.y = y0;
    }

    public double getXf() {
        return xf;
    }

    public void setXf(double xf) {
        this.xf = xf;
    }

    @Override
    public String toString() {
        return "Euler{" + "x=" + x + ", y=" + y + ", xf=" + xf + '}';
    }

    

    

    

}
