/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frms;
import Ej1Empleados.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar Garcia
 */
public class Frm1 extends javax.swing.JFrame {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    Cliente cliente;
    Empleado empleado;
    int n = 0, z = 0;
    
    public void clearEntries(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtDomicilio.setText("");
        txtLimiteCredito.setText("");
        txtHorasTrabajadas.setText("");
        txtSalarioPorHora.setText("");
    }
        private void cargarTablaCliente(JTable table, int n, ArrayList<Cliente> ArrayCliente){
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
       
        cliente = ArrayCliente.get(n);
        String [] arreglo = { cliente.getNombre(), cliente.getCedula(), cliente.getDomicilio(), cliente.getLimCred() + ""};
        modelo.addRow(arreglo);    
        n ++;
         }
        
        private void cargarTablaEmpleado(JTable table, int n, ArrayList<Empleado> ArrayEmpleado){
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
       
        empleado = ArrayEmpleado.get(n);
        String [] arreglo = { empleado.getNombre(), empleado.getCedula(), empleado.getDomicilio(), empleado.getSueldoHora()+ "",empleado.getHorasTrab() + "",empleado.getSueldoFinal()+""};
        modelo.addRow(arreglo);    
        z ++;
         }


    public Frm1() {
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
        frmEmpleados = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtLimiteCredito = new javax.swing.JTextField();
        lblSalarioPorHora = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblHorasTrabajadas = new javax.swing.JLabel();
        txtSalarioPorHora = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtHorasTrabajadas = new javax.swing.JTextField();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        lblLimiteCredito = new javax.swing.JLabel();
        btnMostrarCliente = new javax.swing.JButton();
        btnMostrarEmpleado = new javax.swing.JButton();

        frmClientes.setMinimumSize(new java.awt.Dimension(750, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Registros de Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Direccion", "Limite Crediticio"
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Registros de Empleados");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Direccion", "Horas Trabajadas", "Sueldo por  Hora", "Sueldo Final"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout frmEmpleadosLayout = new javax.swing.GroupLayout(frmEmpleados.getContentPane());
        frmEmpleados.getContentPane().setLayout(frmEmpleadosLayout);
        frmEmpleadosLayout.setHorizontalGroup(
            frmEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
            .addGroup(frmEmpleadosLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmEmpleadosLayout.setVerticalGroup(
            frmEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gestion de Empleados / Clientes");

        lblCedula.setText("Cédula:");

        lblSalarioPorHora.setText("Salario por Hora:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        lblHorasTrabajadas.setText("Horas Trabajadas:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblDomicilio.setText("Domicilio:");

        lblTipo.setText("Tipo:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Cliente" }));
        cboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoItemStateChanged(evt);
            }
        });

        lblLimiteCredito.setText("Límite de Crédito:");

        btnMostrarCliente.setText("Mostrar Clientes");
        btnMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClienteActionPerformed(evt);
            }
        });

        btnMostrarEmpleado.setText("Mostrar Empleados");
        btnMostrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnMostrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblCedula))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipo)
                            .addComponent(lblDomicilio)
                            .addComponent(lblLimiteCredito))
                        .addComponent(lblHorasTrabajadas)
                        .addComponent(lblSalarioPorHora, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addComponent(txtDomicilio)
                        .addComponent(cboTipo, 0, 231, Short.MAX_VALUE)
                        .addComponent(txtLimiteCredito)
                        .addComponent(txtHorasTrabajadas)
                        .addComponent(txtSalarioPorHora))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarCliente)
                    .addComponent(btnMostrarEmpleado))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDomicilio)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipo)
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLimiteCredito)
                        .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHorasTrabajadas)
                        .addComponent(txtHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSalarioPorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSalarioPorHora))
                    .addGap(38, 38, 38)
                    .addComponent(btnRegistrar)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String domicilio = txtDomicilio.getText();
        String tipo = cboTipo.getSelectedItem().toString();

        // Validar que los campos requeridos no estén vacíos
        if (cedula.isEmpty() || nombre.isEmpty() || domicilio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (tipo.equals("Cliente")) {
                double limiteCredito = Double.parseDouble(txtLimiteCredito.getText());
              
                Cliente cliente = new Cliente(limiteCredito, cedula, domicilio, nombre);
                listaClientes.add(cliente);
                cargarTablaCliente(jTable1, n, listaClientes);
            } else if (tipo.equals("Empleado")) {
                int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
                double salarioPorHora = Double.parseDouble(txtSalarioPorHora.getText());
        
                Empleado empleado = new Empleado(horasTrabajadas, salarioPorHora, cedula, domicilio, nombre);
                empleado.calcularSalarioFinal();
                listaEmpleados.add(empleado);
                cargarTablaEmpleado(jTable2, n, listaEmpleados);
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
            if (tipo.equals("Cliente")) {
                txtHorasTrabajadas.setEnabled(false);
                txtSalarioPorHora.setEnabled(false);
            } else {
                txtHorasTrabajadas.setEnabled(true);
                txtSalarioPorHora.setEnabled(true);
                txtLimiteCredito.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnMostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmpleadoActionPerformed
        // TODO add your handling code here:
        frmEmpleados.pack();
        frmEmpleados.setLocationRelativeTo(null);
        frmEmpleados.setVisible(true);
        
        
    }//GEN-LAST:event_btnMostrarEmpleadoActionPerformed

    private void btnMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClienteActionPerformed
        // TODO add your handling code here:
        frmClientes.pack();
        frmClientes.setLocationRelativeTo(null);
        frmClientes.setVisible(true);
    }//GEN-LAST:event_btnMostrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarCliente;
    private javax.swing.JButton btnMostrarEmpleado;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JFrame frmClientes;
    private javax.swing.JFrame frmEmpleados;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblHorasTrabajadas;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalarioPorHora;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtHorasTrabajadas;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalarioPorHora;
    // End of variables declaration//GEN-END:variables
}
