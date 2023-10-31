package bibliotecaantonioestebanaguero.Vistas;


import bibliotecaantonioestebanaguero.AccesoADatos.EjemplarData;
import bibliotecaantonioestebanaguero.AccesoADatos.LectorData;
import bibliotecaantonioestebanaguero.AccesoADatos.LibroData;
import bibliotecaantonioestebanaguero.AccesoADatos.PrestamoData;
import bibliotecaantonioestebanaguero.Utilidades.CustomRenderer;
import bibliotecaantonioestebanaguero.entidades.Lector;
import bibliotecaantonioestebanaguero.entidades.Libro;
import bibliotecaantonioestebanaguero.entidades.Prestamo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Lectores extends javax.swing.JPanel {
    private RowFilter<DefaultTableModel, Object> rowFilter;
    private TableRowSorter<DefaultTableModel> trs; // Declarar el TableRowSorter como una variable de instancia.
    private List<Prestamo> listP;
    private List<Libro> listaA;
    private List<Libro> listaL;
    private LibroData libData;
    private EjemplarData ejeData;
    private PrestamoData presData;
    private LectorData lecData;

    private DefaultTableModel modelo;
    public Lectores() {
        initComponents();
        InitStyles();
        LoadUsers();
        libData = new LibroData();
        listaL = libData.listarLibro();
        modelo = new DefaultTableModel();
        //re.RellenarComboBox("lector", "nombre", jComboBox1);
        rowFilter = RowFilter.regexFilter("(?i)", 1);
        presData = new PrestamoData();
        ejeData = new EjemplarData();
        lecData = new LectorData();
        cargaLector();
        //configurarTabla();
        armarCabeceraTabla();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        campoBusqueda.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de usuario a buscar.");
    }

    private void LoadUsers() {
//        try {
//            DAOUsers dao = new DAOUsersImpl();
//            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getId(), u.getName(), u.getLast_name_p(), u.getLast_name_m(), u.getDomicilio(), u.getTel()}));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        campoBusqueda = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Usuarios");

        searchButton.setBackground(new java.awt.Color(18, 90, 173));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(18, 90, 173));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Borrar");
        deleteButton.setBorderPainted(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(18, 90, 173));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(18, 90, 173));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Nuevo");
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(campoBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addGap(50, 50, 50))))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(177, 177, 177))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       // PanelPrincipal.ShowJPanel(new UpUsers());
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        if (jTable1.getSelectedRows().length < 1) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más usuarios a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
//        } else {
//            for (int i : jTable1.getSelectedRows()) {
//                try {
//                    dao.eliminar((int) jTable1.getValueAt(i, 0));
//                    model.removeRow(i);
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
//        if (jTable2.getSelectedRow() > -1) {
//            try {
//                int idLector = (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
//                DAOUsers dao = new DAOUsersImpl();
//                PanelPrincipal.ShowJPanel(new AltaLector(userId)));
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        } else {
//            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el usuario a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
borrarFilas();
        String titulo = null;
        
        for (Libro lib : libData.listarLibro()) {

            if (lib.getTitulo().toLowerCase().startsWith(searchButton.getText().toLowerCase())) {
                modelo.addRow(new Object[]{
                    lib.getIsbn(),
                    lib.getTitulo(),
                    lib.getAutor(),
                    lib.getAnio(),
                    lib.getGenero(),
                    lib.getEditorial(),
                    lib.isEstado(),});
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    
    
    private void cargaLector() {
        for (Lector lector : listaL) {
            TableModel modelo = null;
            jTable2.setModel(modelo);
        }
    }


    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID ISBN");
        filaCabecera.add("Titulo");
        filaCabecera.add("Autor");
        filaCabecera.add("Año");
        filaCabecera.add("Genero");
        filaCabecera.add("Editorial");
        filaCabecera.add("Estado");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
            
        }

        jTable2.setModel(modelo);

        // Aplica el renderer personalizado a la columna "ID ISBN"
        int columnaTitulo = 1;
        jTable2.getColumnModel().getColumn(columnaTitulo).setCellRenderer(new CustomRenderer());
    }

   private void borrarFilas() {
    try {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        int filas = modelo.getRowCount();
        for (int f = filas - 1; f >= 0; f--) {
            modelo.removeRow(f);
        }
    } catch (NullPointerException ex) {
        JOptionPane.showMessageDialog(null, "Ocurrio un error: " + ex.getMessage());
    }
}

 
private void actualizarTabla(String opcionSeleccionada) {
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setRowCount(0); // Borra la tabla antes de agregar nuevos resultados.

    for (Libro lib : libData.listarLibro()) {
        if (opcionSeleccionada.equals("Todos") || lib.getTitulo().toLowerCase().startsWith(opcionSeleccionada.toLowerCase())) {
            modelo.addRow(new Object[]{
                lib.getIsbn(),
                lib.getTitulo(),
                lib.getAutor(),
                lib.getAnio(),
                lib.getGenero(),
                lib.getEditorial(),
                lib.isEstado()
            });
        }
    }

    jtablaTitulo.setModel(modelo);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}