/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frms;
import Ej8Futbol.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar Garcia
 */
public class Frm7 extends javax.swing.JFrame {
    private ArrayList<Portero> listaPorteros = new ArrayList<>();
    private ArrayList<Defensa> listaDefensas = new ArrayList<>();
    private ArrayList<Medio> listaMedios = new ArrayList<>();
    private ArrayList<Delantero> listaDelanteros = new ArrayList<>();

    String tipo;
    public void clearEntries(){
        txtNombre.setText("");
        txtMinJug.setText("");
        txtDorsal.setText("");
        txtGolesAnot.setText("");
    }
        private void cargarRegitros(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
        for(int i = 0; i < listaPorteros.size(); i++){
            Portero portero = listaPorteros.get(i);
            String [] arreglo = {portero.getPosicion(),portero.getNombre(), portero.getDorsal()+ "", portero.getGoles()+"", portero.getMinJug()+ ""};
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaDefensas.size(); i++){
            Defensa defensa = listaDefensas.get(i);
            String [] arreglo = {defensa.getPosicion(),defensa.getNombre(), defensa.getDorsal()+ "", defensa.getGoles()+"", defensa.getMinJug()+ ""};
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaMedios.size(); i++){
            Medio medio = listaMedios.get(i);
            String [] arreglo = {medio.getPosicion(),medio.getNombre(), medio.getDorsal()+ "", medio.getGoles()+"", medio.getMinJug()+ ""};
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaDelanteros.size(); i++){
            Delantero medio = listaDelanteros.get(i);
            String [] arreglo = {medio.getPosicion(),medio.getNombre(), medio.getDorsal()+ "", medio.getGoles()+"", medio.getMinJug()+ ""};
            modelo.addRow(arreglo);    
          
        }
        
         }
        

   
    public Frm7() {
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
        txtNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        btnMostrarRegistros = new javax.swing.JButton();
        lblCedula1 = new javax.swing.JLabel();
        txtDorsal = new javax.swing.JTextField();
        lblVelMax = new javax.swing.JLabel();
        txtMinJug = new javax.swing.JTextField();
        lblVelMax1 = new javax.swing.JLabel();
        txtGolesAnot = new javax.swing.JTextField();

        frmRegistros.setMinimumSize(new java.awt.Dimension(750, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Registros de Jugadaores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Nombre", "Dorsal", "Goles", "Minutos Jugados"
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRegistrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(290, 290, 290))
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gestion de Jugadores");

        lblCedula.setText("Dorsal:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblTipo.setText("Posicion:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Medio", "Delantero" }));
        cboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoItemStateChanged(evt);
            }
        });
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        btnMostrarRegistros.setText("Mostrar Registros");
        btnMostrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistrosActionPerformed(evt);
            }
        });

        lblCedula1.setText("Nombre:");

        lblVelMax.setText("Minutos Jugados:");

        lblVelMax1.setText("Goles Anotados:");

        txtGolesAnot.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(lblTipo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblVelMax, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCedula1, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(lblVelMax1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGolesAnot)
                    .addComponent(txtDorsal)
                    .addComponent(txtMinJug)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 209, Short.MAX_VALUE))
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(176, 176, 176))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula1))
                        .addGap(18, 18, 18)
                        .addComponent(txtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVelMax, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGolesAnot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarRegistros)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        String minJug = txtMinJug.getText();
        String golesAnot = txtGolesAnot.getText();
        String dorsal = txtDorsal.getText();
        String tipo = cboTipo.getSelectedItem().toString();

        // Validar que los campos requeridos no estén vacíos
        if ( nombre.isEmpty() || minJug.isEmpty()|| dorsal.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (tipo.equals("Portero")) {
                Portero portero = new Portero(nombre,Double.parseDouble(minJug), Integer.valueOf(dorsal));
                listaPorteros.add(portero);
               
            } else if (tipo.equals("Defensa")) {
                Defensa defensa = new Defensa(nombre,Double.parseDouble(minJug), Integer.valueOf(golesAnot), Integer.valueOf(dorsal));
                listaDefensas.add(defensa);
            }
            else if (tipo.equals("Defensa")) {
                Defensa defensa = new Defensa(nombre,Double.parseDouble(minJug), Integer.valueOf(golesAnot), Integer.valueOf(dorsal));
                listaDefensas.add(defensa);
                
            }else if (tipo.equals("Medio")) {
                Medio medio = new Medio(nombre,Double.parseDouble(minJug), Integer.valueOf(golesAnot), Integer.valueOf(dorsal));
                listaMedios.add(medio);
                
            }else if (tipo.equals("Delantero")) {
                Delantero delantero = new Delantero(nombre,Double.parseDouble(minJug), Integer.valueOf(golesAnot), Integer.valueOf(dorsal));
                listaDelanteros.add(delantero);
                
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
            if (tipo.equals("Portero")) {
                txtGolesAnot.setEnabled(false);
            } else if (tipo.equals("Defensa")|| tipo.equals("Medio")|| tipo.equals("Delantero")){
               txtGolesAnot.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void btnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrosActionPerformed
        // TODO add your handling code here:
        cargarRegitros();
        frmRegistros.pack();
        frmRegistros.setLocationRelativeTo(null);
        frmRegistros.setVisible(true);
    }//GEN-LAST:event_btnMostrarRegistrosActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

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
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Frm7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarRegistros;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JFrame frmRegistros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVelMax;
    private javax.swing.JLabel lblVelMax1;
    private javax.swing.JTextField txtDorsal;
    private javax.swing.JTextField txtGolesAnot;
    private javax.swing.JTextField txtMinJug;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
