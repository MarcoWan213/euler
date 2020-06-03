
package euler;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class eulerLogico {

    ArrayList<Euler> datos;

    public eulerLogico(ArrayList<Euler> datos) {
        this.datos = datos;
    }

    public double[] valsX(double x0, double xf, double h) {
        int cont = 0;
        double aux = x0;
        while (aux <= xf) {
            aux += h;
            cont++;
        }
        double[] valoresX = new double[cont];
        for (int i = 0; i < valoresX.length; i++) {
            DecimalFormat df = new DecimalFormat("#.00");
            valoresX[i] = Double.parseDouble(df.format(x0));
            x0 += h;
        }
        return valoresX;    
    }

    //FUNCION A EVALUAR
    public double funcion(double x0, double y0) {
        double r;
        String z = "x0 - y0 + 2";
        r = x0 + Math.pow(y0, 2);
        return r;
    }

    public double[][] valsYFdx(double x0, double y0, double h, double aX[]) {
        DecimalFormat df = new DecimalFormat("#.000000");
        double r[][] = new double[aX.length][2];
        r[0][0] = y0;
        r[0][1] = funcion(x0, y0);
        for (int i = 1; i < aX.length; i++) {
            r[i][0] = r[i - 1][0] + h * r[i - 1][1];
            r[i][1] = funcion(aX[i], r[i][0]);
            r[i][0] = Double.parseDouble(df.format(r[i][0]));
            r[i][1] = Double.parseDouble(df.format(r[i][1]));
        }
        return r;
    }

    
    /*public static void main(String[] args) {
        Euler e = new Euler();
        double[] v = e.valsX(0, 1, 0.1);        
        double [][] yfdx = e.valsYFdx(0, 2, 0.1, v);
        
        for (int i = 0; i < yfdx.length; i++) {
            System.out.print(v[i]+ "  ");
            for (int j = 0; j < 2; j++) {
                System.out.print(yfdx[i][j]+ "  ");
            }
            System.out.println("");
        }
    }*/

}
