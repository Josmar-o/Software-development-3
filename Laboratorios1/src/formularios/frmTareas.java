/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;
import clases.Tarea;
import java.time.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar Garcia
 */
public class frmTareas extends javax.swing.JFrame {
    ArrayList<Tarea> tareasPorHacer = new ArrayList<>();
    ArrayList<Tarea> tareasCompletadas = new ArrayList<>();
    String prioridadSeleccionada;
    Tarea tareaSeleccionada;
    LocalTime selectedDate;
    int n = -1 ,x= -1;
    
    
    private void cargarTabla(JTable table, int n, ArrayList<Tarea> ArrayTarea){
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
       
            tareaSeleccionada = ArrayTarea.get(n);
            String []arreglo = {tareaSeleccionada.getTituloTarea(),tareaSeleccionada.getFechaVencimiento(),tareaSeleccionada.getHoraVencimiento(), tareaSeleccionada.getPrioridad(),tareaSeleccionada.getDescripcionTarea(), tareaSeleccionada.estaCompletado(tareaSeleccionada.getCompletado())};
            modelo.addRow(arreglo);     
            
    }
    
    private void cleanTxt(){
        txtTitulo.setText("");
        txtDescripcion.setText("");
        datePicker.setText("");
        timePicker.setText("");
    }
    
    public void RefreshTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        if(n  > -1){
            for (Tarea tarea : tareasPorHacer){
            String []arreglo = {tarea.getTituloTarea(),tarea.getFechaVencimiento(),tarea.getHoraVencimiento(), tarea.getPrioridad(),tarea.getDescripcionTarea(), tarea.estaCompletado(tarea.getCompletado())};
            model.addRow(arreglo);
        }
        }
    }
   
    /**
     * Creates new form frmTareas
     */
    public frmTareas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbPrioridad = new javax.swing.JComboBox<>();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        timePicker = new com.github.lgooddatepicker.components.TimePicker();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnCompletado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("Gestor de Tareas");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Entrada"));

        jLabel2.setText("Titulo");

        jLabel4.setText("Vencimiento");

        txtTitulo.setText(" ");

        jLabel5.setText("Prioridad");

        cbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgente", "Maxima", "Minima", "Baja ", "Sin prioridad" }));
        cbPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrioridadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Fecha Venc", "Hora Venc", "Prioridad", "Descripcion", "Estado"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(jTable1);

    txtAreaDesc.setColumns(20);
    txtAreaDesc.setRows(5);
    jScrollPane3.setViewportView(txtAreaDesc);

    jLabel6.setText("Tareas pendientes");
    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Titulo", "Fecha Venc", "Hora Venc", "Prioridad", "Descripcion", "Estado"
        }
    )
    {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
    );
    jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable2MouseClicked(evt);
        }
    });
    jScrollPane4.setViewportView(jTable2);

    btnCompletado.setText("Completado");
    btnCompletado.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCompletadoActionPerformed(evt);
        }
    });

    jLabel7.setText("Tareas Completadas");
    jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

    jLabel8.setText("TOCA UN ROW Y \nMIRA LA DESCRIPCION AKI");
    jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(320, 320, 320)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6)
            .addGap(169, 169, 169))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(113, 113, 113)
                            .addComponent(btnCompletado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(jLabel3))
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addGap(186, 186, 186))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(107, 107, 107))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel1))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompletado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrioridadActionPerformed
        // TODO add your handling code here:
        String itemSeleccionado = cbPrioridad.getSelectedItem().toString();
        if(itemSeleccionado != null){
            prioridadSeleccionada = itemSeleccionado;
        }
    }//GEN-LAST:event_cbPrioridadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try{
        this.n++;
        String fechaVencimiento = datePicker.getDate() + "";
        String horaVencimiento = timePicker.getTime() + "";
        String tituloTarea = txtTitulo.getText();
        String descripcionTarea = txtDescripcion.getText();
        Tarea.agregarTarea(tituloTarea, descripcionTarea, fechaVencimiento, horaVencimiento, prioridadSeleccionada,false, tareasPorHacer );
        txtAreaDesc.setText(descripcionTarea); 
        cargarTabla(jTable1 , n, tareasPorHacer);
        cleanTxt();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Se ha presentado un error");
        }
    
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
     int selectedRow = jTable1.getSelectedRow();
     if (selectedRow != -1){
         Object data = jTable1.getValueAt(selectedRow, 4);
         txtAreaDesc.setText(data.toString());
     }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
     int selectedRow = jTable2.getSelectedRow();
     if (selectedRow != -1){
         Object data = jTable2.getValueAt(selectedRow, 4);
         txtAreaDesc.setText(data.toString());
     }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletadoActionPerformed
        // TODO add your handling code here:    
        try{
        int selectedRow = jTable1.getSelectedRow();

        if(selectedRow >= 0 && selectedRow < tareasPorHacer.size()){  
        this.n--;
        x++;
        Tarea.copiarTarea(tareasPorHacer, tareasCompletadas, selectedRow);
        cargarTabla(jTable2, x, tareasCompletadas); // Refresh the completed tasks table
        tareasPorHacer.remove(selectedRow);
        RefreshTable(jTable1);
        }
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Se ha presentado un error");
        }
    }//GEN-LAST:event_btnCompletadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCompletado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbPrioridad;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private com.github.lgooddatepicker.components.TimePicker timePicker;
    private javax.swing.JTextArea txtAreaDesc;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
