/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frms;
import Ej4FormaDePago.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

/**
 *
 * @author Omar Garcia
 */
public class Frm4 extends javax.swing.JFrame {
 
    private ArrayList<Efectivo> listaEfectivo = new ArrayList<>();
    private ArrayList<TransferenciaBancaria> listaTransBan = new ArrayList<>();
    private ArrayList<TarjetaDeDebito> listaTarDeb  = new ArrayList<>();
    private ArrayList<TarjetaDeCredito> listaTarCred  = new ArrayList<>();
    String tipoDeVehiculo;
    
    public String esOnline(boolean online){
       return online ? "Si": "No";
    }
    public void clearEntries(){
        datePicker.setText("");
        txtCantidad.setText("");
        
    }
        private void cargarRegitros(JTable table){
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        
        for(int i = 0; i < listaEfectivo.size(); i++){
            Efectivo efectivo = listaEfectivo.get(i);
            String [] arreglo = {efectivo.getTipoDePago(), String.valueOf(efectivo.getCantidad()), String.valueOf(efectivo.getFechaDeTrans()), esOnline(efectivo.isOnline())};
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaTransBan.size(); i++){
            TransferenciaBancaria transBan = listaTransBan.get(i);
            String [] arreglo = {transBan.getTipoDePago(), String.valueOf(transBan.getCantidad()), String.valueOf(transBan.getFechaDeTrans()), esOnline(transBan.isOnline())};
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaTarDeb.size(); i++){
            TarjetaDeDebito tarDeb = listaTarDeb.get(i);
            String [] arreglo = {tarDeb.getTipoDePago(), String.valueOf(tarDeb.getCantidad()), String.valueOf(tarDeb.getFechaDeTrans()), esOnline(tarDeb.isOnline())};
            modelo.addRow(arreglo);    
            
        }
        for(int i = 0; i < listaTarCred.size(); i++){
            TarjetaDeCredito tarCred = listaTarCred.get(i);
            String [] arreglo = {tarCred.getTipoDePago(), String.valueOf(tarCred.getCantidad()), String.valueOf(tarCred.getFechaDeTrans()), esOnline(tarCred.isOnline())};
            modelo.addRow(arreglo);    
            
        }
      }
        

   
    public Frm4() {
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
        frmRegistros = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblVelMax = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        btnMostrarRegistros = new javax.swing.JButton();
        lblCedula1 = new javax.swing.JLabel();
        checkOnline = new javax.swing.JCheckBox();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();

        frmRegistros.setMinimumSize(new java.awt.Dimension(750, 500));

        jLabel3.setText("Registros de Pagos");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Pagos", "Cantidad", "Fecha", "¿Es Online?"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout frmRegistrosLayout = new javax.swing.GroupLayout(frmRegistros.getContentPane());
        frmRegistros.getContentPane().setLayout(frmRegistrosLayout);
        frmRegistrosLayout.setHorizontalGroup(
            frmRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRegistrosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(frmRegistrosLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmRegistrosLayout.setVerticalGroup(
            frmRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRegistrosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel2.setText("Gestion de Pagos");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblCedula.setText("¿Es online?");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblVelMax.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia Bancaria", "Tarjeta de Debito", "Tarjeta de Credito" }));
        cboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoItemStateChanged(evt);
            }
        });

        btnMostrarRegistros.setText("Mostrar Registros");
        btnMostrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistrosActionPerformed(evt);
            }
        });

        lblCedula1.setText("Fecha de Transaccion");

        checkOnline.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVelMax, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCedula1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(checkOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnMostrarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(24, 24, 24)
                        .addComponent(lblVelMax))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula1)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula)
                    .addComponent(checkOnline))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarRegistros)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String cantidad = txtCantidad.getText();
        String fecha = datePicker.getText();
        boolean online = checkOnline.isSelected();
        String tipo = cboTipo.getSelectedItem().toString();
        LocalDate fechaDeTrans = datePicker.getDate();

        // Validar que los campos requeridos no estén vacíos
        if ( cantidad.isEmpty() || fecha.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (tipo.equals("Efectivo")) {
                Efectivo efectivo  = new Efectivo(Double.parseDouble(cantidad), fechaDeTrans);
                listaEfectivo.add(efectivo);
                cargarRegitros(jTable1);
            } else if (tipo.equals("Transferencia Bancaria")) {
                TransferenciaBancaria transBan  = new TransferenciaBancaria(Double.parseDouble(cantidad), fechaDeTrans, online);
                listaTransBan.add(transBan);
                cargarRegitros(jTable1);
                
            }else if(tipo.equals("Tarjeta de Debito")){
                TarjetaDeDebito tarDeb  = new TarjetaDeDebito(Double.parseDouble(cantidad), fechaDeTrans, online);
                listaTarDeb.add(tarDeb);
                cargarRegitros(jTable1);
            }else if(tipo.equals("Tarjeta de Credito")){
                TarjetaDeCredito tarCred  = new TarjetaDeCredito(Double.parseDouble(cantidad), fechaDeTrans, online);
                listaTarCred.add(tarCred);
                cargarRegitros(jTable1);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        clearEntries();
        
        

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String tipo = cboTipo.getSelectedItem().toString();
            if (tipo.equals("Efectivo")) {
                checkOnline.setEnabled(false);

            } else if (tipo.equals("Cuenta De Ahorro") || tipo.equals("Tarjeta de Debito")  || tipo.equals("Tarjeta de Credito")){
               


               checkOnline.setEnabled(true);
            }
        }
        
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrosActionPerformed
        // TODO add your handling code here:
        frmRegistros.pack();
        frmRegistros.setLocationRelativeTo(null);
        frmRegistros.setVisible(true);
    }//GEN-LAST:event_btnMostrarRegistrosActionPerformed

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
            java.util.logging.Logger.getLogger(Frm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarRegistros;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JCheckBox checkOnline;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JFrame frmRegistros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVelMax;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
