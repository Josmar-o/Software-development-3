/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frms;
import Ej3Productos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar Garcia
 */
public class Frm3 extends javax.swing.JFrame {
 
    private ArrayList<Automovil> listaAutomovil = new ArrayList<>();
    private ArrayList<Bicicleta> listaBicicleta = new ArrayList<>();
    private ArrayList<Motocicleta> listaMotocicleta  = new ArrayList<>();
    String tipoDeVehiculo;
    Automovil automovil;
    Bicicleta bicicleta;
    Motocicleta motocicleta;
    public void clearEntries(){
        txtCombusKm.setText("");
        txtVelMax.setText("");
    }
        private void cargarRegitros(JTable table, String tipoDeVehiculo){
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        
        for(int i = 0; i < listaAutomovil.size(); i++){
            automovil = listaAutomovil.get(i);
            String [] arreglo = { automovil.getTipoDeVehiculo(), automovil.getVelMax() + "", automovil.getCantLlantas() + "", automovil.getCombusPorKm() + ""};
            modelo.addRow(arreglo);    
            i ++;
        }
        for(int i = 0; i < listaBicicleta.size(); i++){
            bicicleta = listaBicicleta.get(i);
            String [] arreglo = { bicicleta.getTipoDeVehiculo(), bicicleta.getVelMax() + "", bicicleta.getCantLlantas() + "", bicicleta.getCombusPorKm() + ""};
            modelo.addRow(arreglo);    
            i ++;
        }
        for(int i = 0; i < listaMotocicleta.size(); i++){
            motocicleta = listaMotocicleta.get(i);
            String [] arreglo = { motocicleta.getTipoDeVehiculo(), motocicleta.getVelMax() + "", motocicleta.getCantLlantas() + "", motocicleta.getCombusPorKm() + ""};
            modelo.addRow(arreglo);    
            i ++;
        }
         }
        

   
    public Frm3() {
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
        frmClientes = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblVelMax = new javax.swing.JLabel();
        txtCombusKm = new javax.swing.JTextField();
        txtVelMax = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        btnMostrarRegistros = new javax.swing.JButton();

        frmClientes.setMinimumSize(new java.awt.Dimension(750, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Registros de Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Vehiculo", "Velocidad Maxima", "Cantidad de Llantas", "Gal de Combustible por Km"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout frmClientesLayout = new javax.swing.GroupLayout(frmClientes.getContentPane());
        frmClientes.getContentPane().setLayout(frmClientesLayout);
        frmClientesLayout.setHorizontalGroup(
            frmClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmClientesLayout.createSequentialGroup()
                .addGroup(frmClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmClientesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                    .addGroup(frmClientesLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frmClientesLayout.setVerticalGroup(
            frmClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmClientesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gestion de Vehiculos");

        lblCedula.setText("Gal de Combustible Por km");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblVelMax.setText("Velocidad Maxima");

        txtVelMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelMaxActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Bicicleta", "Motocicleta" }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblTipo))
                            .addComponent(lblVelMax))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtVelMax, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCombusKm, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelMax))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCombusKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(34, 34, 34)
                .addComponent(btnRegistrar)
                .addGap(26, 26, 26)
                .addComponent(btnMostrarRegistros)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String combusKm = txtCombusKm.getText();
        String velMax = txtVelMax.getText();
        String tipo = cboTipo.getSelectedItem().toString();

        // Validar que los campos requeridos no estén vacíos
        if ( velMax.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (tipo.equals("Automovil")) {
               Automovil automovil = new Automovil(Double.parseDouble(velMax), Double.parseDouble(combusKm));
                listaAutomovil.add(automovil);
                cargarRegitros(jTable1, tipo);
            } else if (tipo.equals("Bicicleta")) {
               tipoDeVehiculo = "Bicicleta";
                Bicicleta bicicleta = new Bicicleta(Double.parseDouble(velMax));
                listaBicicleta.add(bicicleta);
                cargarRegitros(jTable1, tipo);
                
            }else if(tipo.equals("Motocicleta")){
                Motocicleta moto = new Motocicleta(Double.parseDouble(velMax), Double.parseDouble(combusKm));
                listaMotocicleta.add(moto);
                cargarRegitros(jTable1, tipo);
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
            if (tipo.equals("Bicicleta")) {
                txtCombusKm.setEnabled(false);
            } else {
               txtVelMax.setEnabled(true);
               txtCombusKm.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void txtVelMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelMaxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtVelMaxActionPerformed

    private void btnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrosActionPerformed
        // TODO add your handling code here:
        frmClientes.pack();
        frmClientes.setLocationRelativeTo(null);
        frmClientes.setVisible(true);
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
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarRegistros;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JFrame frmClientes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVelMax;
    private javax.swing.JTextField txtCombusKm;
    private javax.swing.JTextField txtVelMax;
    // End of variables declaration//GEN-END:variables
}
