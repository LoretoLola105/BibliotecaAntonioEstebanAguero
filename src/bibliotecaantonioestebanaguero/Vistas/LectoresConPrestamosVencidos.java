package bibliotecaantonioestebanaguero.Vistas;



import bibliotecaantonioestebanaguero.AccesoADatos.EjemplarData;
import bibliotecaantonioestebanaguero.AccesoADatos.LectorData;
import bibliotecaantonioestebanaguero.AccesoADatos.LibroData;
import bibliotecaantonioestebanaguero.AccesoADatos.PrestamoData;
import bibliotecaantonioestebanaguero.AccesoADatos.RellenarCombos;
import bibliotecaantonioestebanaguero.Utilidades.CustomRendererLectores;
import bibliotecaantonioestebanaguero.entidades.Lector;
import bibliotecaantonioestebanaguero.entidades.Libro;
import bibliotecaantonioestebanaguero.entidades.Prestamo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class LectoresConPrestamosVencidos extends javax.swing.JPanel {

    private DefaultTableModel modelo;
    private LectorData lecData = new LectorData();
    private PrestamoData presData = new PrestamoData();
    private EjemplarData ejeData = new EjemplarData();
    private RowFilter<DefaultTableModel, Object> rowFilter;
    private TableRowSorter<DefaultTableModel> trs; // Declarar el TableRowSorter como una variable de instancia.
    private List<Lector> listLec;
    private List<Prestamo> listP;
    private List<Libro> listaA;
    private List<Libro> listaL;
    private LibroData libData;

    RellenarCombos re = new RellenarCombos();

    public LectoresConPrestamosVencidos() {
        initComponents();

        SetDate();
        lecData = new LectorData();
        List<Lector> listaL = lecData.listarLectores();
        modelo = new DefaultTableModel();
        PrestamoData presData = new PrestamoData();
        List<Lector> listP = presData.listarLectoresVencidos();
        

        armarCabeceraTabla();
        libData = new LibroData();
        re.RellenarComboBox("lector", "nombre", jComboBox1);
        rowFilter = RowFilter.regexFilter("(?i)", 1);
        presData = new PrestamoData();


        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcionSeleccionada = (String) jComboBox1.getSelectedItem();
                // Actualiza su tabla en función de la opción seleccionada
                actualizarTabla(opcionSeleccionada);
                //listaL = libData.listarLibro();

            }

        });

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTexPaneFechaActual = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO DE LECTORES CON PRESTAMO VENCIDO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("FECHA ACTUAL:");

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("BUSQUEDA DE LECTORES:");

        jScrollPane1.setViewportView(jTexPaneFechaActual);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 365, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        jTexPaneFechaActual.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    private void cargaLectoresConPrestamoVencido() {
        Iterable<Lector> listP = null;
        for (Lector lec : listP) {
            String item = null;
            jTable2.setModel(modelo);

        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID Lector");
        filaCabecera.add("Nombre");
        filaCabecera.add("DNI");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Email");
        filaCabecera.add("NumeroTel");
        filaCabecera.add("Estado");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);

        }

        jTable2.setModel(modelo);

        // Aplica el renderer personalizado a la columna "ID ISBN"
        int columnaNombre = 1;
        jTable2.getColumnModel().getColumn(columnaNombre).setCellRenderer(new CustomRendererLectores());
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

//    private void actualizarTabla(String opcionSeleccionada) {
//    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
//    modelo.setRowCount(0); // Borra la tabla antes de agregar nuevos resultados.
//    
//    List<Prestamo> prestamos = presData.obtenerLectoresConPrestamosVencidos(opcionSeleccionada);
//    
//    for (Prestamo pres : prestamos) {
//        if (opcionSeleccionada.equals("Todos") || pres.getFechaPrestamo().toLowerCase().startsWith(opcionSeleccionada.toLowerCase())) {
//            modelo.addRow(new Object[]{
//                pres.getIdPrestamo(), // Reemplaza por la propiedad correcta de Prestamo
//                pres.getLector().getIdLector(), // Reemplaza por la propiedad correcta de Prestamo
//                pres.getEjemplar().getIdEjemplar(), // Reemplaza por la propiedad correcta de Prestamo
//                pres.getFechaPrestamo(),
//                pres.getFechaDevolucion(),
//                pres.getEstado()
//            });
//        }
//    }
//
//    jTable2.setModel(modelo);
//}
    
    
    private void actualizarTabla(String opcionSeleccionada) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0); // Borra la tabla antes de agregar nuevos resultados.

        for (Lector lec : presData.listarLectoresVencidos()) {
            if (opcionSeleccionada.equals("Todos") || lec.getNombre().toLowerCase().startsWith(opcionSeleccionada.toLowerCase())) {
                modelo.addRow(new Object[]{
                    lec.getIdLector(),
                    lec.getNombre(),
                    lec.getDni(),
                    lec.getDomicilio(),
                    lec.getEmail(),
                    lec.getNumeroTel(),
                    lec.getEstado()
                });
            }
        }

        jTable2.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTexPaneFechaActual;
    // End of variables declaration//GEN-END:variables
}
