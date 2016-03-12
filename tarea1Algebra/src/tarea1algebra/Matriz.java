/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1algebra;

import javax.swing.JOptionPane;

/**
 *
 * @author daryl
 */
public class Matriz {

    int sizeRow = 0;
    int sizeColumn = 0;
    boolean tamañoCorrectoI = false;
    boolean tamañoCorrectoJ = false;

    public Matriz() {
    }

    public void setRowSize() {
        int row=0;
            try {
                row = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de filas de la matriz"));
                if(row > 0 && row <= 5)
                {
                    tamañoCorrectoI=true;
                    sizeRow=row;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Por favor digite un numero entre 0 y 5");
                }
                
            } catch (NumberFormatException nfe) {               
                JOptionPane.showMessageDialog(null, "cantidad de filas= "+ sizeRow);
            }
    }
    public void setColumnSize() {
        int column=0;
            try {
                column = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de columnas de la matriz"));
                if(column > 0 && column <= 5)
                {
                    tamañoCorrectoI=true;
                    sizeColumn=column;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Por favor digite un numero entre 0 y 5");
                }
                
            } catch (NumberFormatException nfe) {               
                JOptionPane.showMessageDialog(null, "cantidad de filas= "+ sizeColumn);
            }
    }
    public boolean matrizConstruida()
    {
        if(tamañoCorrectoI == true && tamañoCorrectoJ== true)
        {
            return true;
        }
        return false;
    }
    public int getSizeRow() {
        return sizeRow;
    }

    public int getSizeColumn() {
        return sizeColumn;
    }

}
