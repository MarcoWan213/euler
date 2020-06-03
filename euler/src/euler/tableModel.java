/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author usuario
 */
public class tableModel extends AbstractTableModel {

    public static String[] columnas = {"x", "y", "f(x,y)"};
    public ArrayList<Euler> datos = new ArrayList<Euler>();

    public tableModel() {
    }

    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Euler e = this.datos.get(i);
        switch (i1) {
            case 0:
                return e.getX();
            case 1:
                return e.getY();
            case 2:
                return e.getXf();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }

    public void llenarArrayList(double x0, double y0, double h, double xf) {
        
        eulerLogico m = new eulerLogico(datos);
        double aVX[] = m.valsX(x0, xf, h);        
        double aYFDx[][] = m.valsYFdx(x0, y0, h, aVX);
        
        for (int i = 0; i < aYFDx.length; i++) {
        Euler aux = new Euler(aVX[i], aYFDx[i][0], aYFDx[i][1]);    
       
        this.datos.add(aux);
        this.fireTableRowsInserted(this.datos.size() - 1, this.datos.size() - 1);
        }               
        
    }

   

}
