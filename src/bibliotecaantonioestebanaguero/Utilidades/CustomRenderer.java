/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaantonioestebanaguero.Utilidades;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Otras
 */
public class CustomRenderer extends DefaultTableCellRenderer {


   private final int columnaTitulo = 1; // Índice de la columna "Autor"

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == columnaTitulo) {
            String autor = table.getValueAt(row, columnaTitulo).toString();
            
            // Verifica el contenido de la celda de la columna "Autor" y colorea la fila en consecuencia
            if (autor.toLowerCase().contains("texto a buscar")) {
                c.setBackground(Color.GREEN);
            } else {
                c.setBackground(Color.CYAN);
            }
        } else {
            // Restablece el fondo predeterminado para otras columnas
            c.setBackground(table.getBackground());
        }
        
        return c;
    }
//    private final int columnaIDISBN = 0; // Índice de la columna "ID ISBN"
//
//    @Override
//    public void setValue(Object value) {
//        if (value != null) {
//            // Convierte el valor de la celda a un entero
//            int valor = Integer.parseInt(value.toString());
//            
//            // Decide el color de fondo en función del valor de la celda
//            if (valor > columnaIDISBN) {
//                setBackground(Color.GREEN);
//            } else {
//                setBackground(Color.RED);
//            }
//        } else {
//            setBackground(Color.WHITE);
//        }
//        super.setValue(value);
//    }
//    
    
}

