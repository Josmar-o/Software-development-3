/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frms;
import Ej5CuentasBancarias.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar Garcia
 */
public class Frm5 extends javax.swing.JFrame {
    
    private ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
    private ArrayList<CuentaDeAhorro> listaCuentaDeAhorro = new ArrayList<>();
    private ArrayList<CuentaDeInversion> listaCuentaDeInversion  = new ArrayList<>();
    String tipo;
    int x = 1, y = 1, z = 1;
    public void clearEntries(){
        txtSaldo.setText("");
        txtTitular.setText("");
        txtLimiteCredito.setText("");
    }
    public void clearEntriesDep(){
        txtDeposito.setText("");
        txtNumCuenDe.setText("");
    }
    public void clearEntriesRe(){
        txtRetiro.setText("");
        txtNumCuenRe.setText("");
    }
        private void cargarRegitros(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
        for(int i = 0; i < listaCuentaCorriente.size(); i++){
            CuentaCorriente cuentaCorriente = listaCuentaCorriente.get(i);
            String [] arreglo = {cuentaCorriente.getTipoDeCuenta(), String.valueOf(cuentaCorriente.getNumCuenta()), cuentaCorriente.getTitular(),String.valueOf(cuentaCorriente.getSaldo()), String.valueOf(cuentaCorriente.getLimiteCredito()), "No posee", "No posee" };
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaCuentaDeAhorro.size(); i++){
            CuentaDeAhorro cuentaAhorro = listaCuentaDeAhorro.get(i);
            String [] arreglo = {cuentaAhorro.getTipoDeCuenta(), String.valueOf(cuentaAhorro.getNumCuenta()), cuentaAhorro.getTitular(),String.valueOf(cuentaAhorro.getSaldo()), "No posee", String.valueOf(cuentaAhorro.calcularInteres()), "No posee" };
            modelo.addRow(arreglo);    
          
        }
        for(int i = 0; i < listaCuentaDeInversion.size(); i++){
            CuentaDeInversion cuentaInversion = listaCuentaDeInversion.get(i);
            String [] arreglo = {cuentaInversion.getTipoDeCuenta(), String.valueOf(cuentaInversion.getNumCuenta()), cuentaInversion.getTitular(),String.valueOf(cuentaInversion.getSaldo()), "No posee", "No posee", String.valueOf(cuentaInversion.calcularRendimientoMensual()) };
            modelo.addRow(arreglo);    
            
        }
         }
        

   
    public Frm5() {
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
        frmDeposito = new javax.swing.JFrame();
        lblTipo1 = new javax.swing.JLabel();
        cboTipoDe = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumCuenDe = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        frmRetiro = new javax.swing.JFrame();
        cboTipoRe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRetiro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumCuenRe = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        lblTipo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblVelMax = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtTitular = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        btnMostrarRegistros = new javax.swing.JButton();
        lblCedula1 = new javax.swing.JLabel();
        txtLimiteCredito = new javax.swing.JTextField();
        btnFrmDep = new javax.swing.JButton();
        brnFrmRet = new javax.swing.JButton();

        frmRegistros.setMinimumSize(new java.awt.Dimension(750, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Registros de Cuentas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Cuenta", "Numero Cuenta", "Titular", "Saldo", "Limite de Credito", "Interes Mensual (5%)", "Rendimiento Mensual (7%)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout frmRegistrosLayout = new javax.swing.GroupLayout(frmRegistros.getContentPane());
        frmRegistros.getContentPane().setLayout(frmRegistrosLayout);
        frmRegistrosLayout.setHorizontalGroup(
            frmRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRegistrosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
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

        lblTipo1.setText("Tipo:");

        cboTipoDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Corriente", "Cuenta De Ahorro", "Cuenta De Inversion" }));
        cboTipoDe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoDeItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Deposito");

        jLabel1.setText("Cantidad de Deposito:");

        txtDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositoActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero De Cuenta:");

        txtNumCuenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCuenDeActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmDepositoLayout = new javax.swing.GroupLayout(frmDeposito.getContentPane());
        frmDeposito.getContentPane().setLayout(frmDepositoLayout);
        frmDepositoLayout.setHorizontalGroup(
            frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDepositoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmDepositoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumCuenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmDepositoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmDepositoLayout.createSequentialGroup()
                        .addComponent(lblTipo1)
                        .addGap(18, 18, 18)
                        .addComponent(cboTipoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDepositoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDepositoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmDepositoLayout.createSequentialGroup()
                        .addComponent(btnDepositar)
                        .addGap(216, 216, 216))))
        );
        frmDepositoLayout.setVerticalGroup(
            frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDepositoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo1))
                .addGap(29, 29, 29)
                .addGroup(frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(frmDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumCuenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnDepositar)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        cboTipoRe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Corriente", "Cuenta De Ahorro", "Cuenta De Inversion" }));
        cboTipoRe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoReItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Retiro");

        jLabel7.setText("Cantidad de Retiro:");

        txtRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetiroActionPerformed(evt);
            }
        });

        jLabel8.setText("Numero De Cuenta:");

        txtNumCuenRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCuenReActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        lblTipo2.setText("Tipo:");

        javax.swing.GroupLayout frmRetiroLayout = new javax.swing.GroupLayout(frmRetiro.getContentPane());
        frmRetiro.getContentPane().setLayout(frmRetiroLayout);
        frmRetiroLayout.setHorizontalGroup(
            frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRetiroLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(223, 223, 223))
            .addGroup(frmRetiroLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmRetiroLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmRetiroLayout.createSequentialGroup()
                        .addComponent(lblTipo2)
                        .addGap(18, 18, 18)
                        .addComponent(cboTipoRe, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmRetiroLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetirar)
                            .addComponent(txtNumCuenRe, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmRetiroLayout.setVerticalGroup(
            frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmRetiroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo2))
                .addGap(29, 29, 29)
                .addGroup(frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(frmRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumCuenRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnRetirar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gestion de Cuentas Bancarias");

        lblCedula.setText("Limite Credito");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblVelMax.setText("Titular de la Cuenta:");

        txtSaldo.setEnabled(false);

        txtTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitularActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Corriente", "Cuenta De Ahorro", "Cuenta De Inversion" }));
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

        lblCedula1.setText("Saldo Inicial:");

        btnFrmDep.setText("Depositar");
        btnFrmDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrmDepActionPerformed(evt);
            }
        });

        brnFrmRet.setText("Retirar");
        brnFrmRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnFrmRetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVelMax)
                            .addComponent(lblCedula1)
                            .addComponent(lblTipo)
                            .addComponent(lblCedula))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLimiteCredito)
                            .addComponent(txtTitular)
                            .addComponent(txtSaldo)
                            .addComponent(cboTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(btnFrmDep)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brnFrmRet, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVelMax))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(brnFrmRet)
                    .addComponent(btnFrmDep))
                .addGap(26, 26, 26)
                .addComponent(btnMostrarRegistros)
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String saldo = txtSaldo.getText();
        String titular = txtTitular.getText();
        String limiteCred = txtLimiteCredito.getText();
        String tipo = cboTipo.getSelectedItem().toString();

        // Validar que los campos requeridos no estén vacíos
        if (titular.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (tipo.equals("Cuenta Corriente")) {
               CuentaCorriente cuentaCorriente = new CuentaCorriente(txtTitular.getText(),x, Double.parseDouble(txtLimiteCredito.getText()) );
                listaCuentaCorriente.add(cuentaCorriente);
                
                x++;
            } else if (tipo.equals("Cuenta De Ahorro")) {
                CuentaDeAhorro cuentaAhorro = new CuentaDeAhorro(txtTitular.getText(), Double.parseDouble(txtSaldo.getText()),y);
                listaCuentaDeAhorro.add(cuentaAhorro);
                
                y++;
                
            }else if(tipo.equals("Cuenta De Inversion")){
                CuentaDeInversion cuentaInversion = new CuentaDeInversion(txtTitular.getText(), Double.parseDouble(txtSaldo.getText()),z);
                listaCuentaDeInversion.add(cuentaInversion);
                
                z++;
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
            if (tipo.equals("Cuenta Corriente")) {
                txtSaldo.setEnabled(false);
                txtLimiteCredito.setEnabled(true);
            } else if (tipo.equals("Cuenta De Ahorro") || tipo.equals("Cuenta De Inversion")){
               txtSaldo.setEnabled(true);
                txtLimiteCredito.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void txtTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitularActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTitularActionPerformed

    private void btnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrosActionPerformed
        // TODO add your handling code here:
        cargarRegitros();
        frmRegistros.pack();
        frmRegistros.setLocationRelativeTo(null);
        frmRegistros.setVisible(true);
    }//GEN-LAST:event_btnMostrarRegistrosActionPerformed

    private void btnFrmDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrmDepActionPerformed
        // TODO add your handling code here:
        frmDeposito.pack();
        frmDeposito.setLocationRelativeTo(null);
        frmDeposito.setVisible(true);
    }//GEN-LAST:event_btnFrmDepActionPerformed

    private void brnFrmRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnFrmRetActionPerformed
        // TODO add your handling code here:
        frmRetiro.pack();
        frmRetiro.setLocationRelativeTo(null);
        frmRetiro.setVisible(true);
    }//GEN-LAST:event_brnFrmRetActionPerformed

    private void cboTipoDeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoDeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoDeItemStateChanged

    private void txtDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepositoActionPerformed

    private void txtNumCuenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCuenDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCuenDeActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
        String cant = txtDeposito.getText();
        String numCuenta = txtNumCuenDe.getText();
        String tipo = cboTipo.getSelectedItem().toString();
        

        // Validar que los campos requeridos no estén vacíos
        if (cant.isEmpty() || numCuenta.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
           try{
                int i = Integer.valueOf(numCuenta) - 1;
                double cantDo = Double.valueOf(cant);
            
                if (tipo.equals("Cuenta Corriente")) {
                    CuentaCorriente cuentaCorriente = listaCuentaCorriente.get(i);
                    cuentaCorriente.depositar(cantDo);
               
                } else if (tipo.equals("Cuenta De Ahorro")) {
                    CuentaDeAhorro cuentaDeAhorro  = listaCuentaDeAhorro.get(i);
                    cuentaDeAhorro.depositar(cantDo);
                
                }else if(tipo.equals("Cuenta De Inversion")){
                    CuentaDeInversion cuentaDeInversion = listaCuentaDeInversion.get(i);
                    cuentaDeInversion.depositar(cantDo);
            }
               
           } catch(IndexOutOfBoundsException e){
               JOptionPane.showMessageDialog(this, "Ingrese un numero de Cuenta Valido\n Verifique los Registros si es Necesario", "Error", JOptionPane.ERROR_MESSAGE);
                return;
           }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Deposito de: $"+ cant + " completado");
        clearEntriesDep();
        
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void cboTipoReItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoReItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoReItemStateChanged

    private void txtRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetiroActionPerformed

    private void txtNumCuenReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCuenReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCuenReActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        String cant = txtRetiro.getText();
        String numCuenta = txtNumCuenRe.getText();
        String tipo = cboTipo.getSelectedItem().toString();
        

        // Validar que los campos requeridos no estén vacíos
        if (cant.isEmpty() || numCuenta.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
           try{
                int i = Integer.valueOf(numCuenta) - 1;
                double cantRe = Double.valueOf(cant);
            
                if (tipo.equals("Cuenta Corriente")) {
                    CuentaCorriente cuentaCorriente = listaCuentaCorriente.get(i);
                    cuentaCorriente.retirar(cantRe);
               
                } else if (tipo.equals("Cuenta De Ahorro")) {
                    CuentaDeAhorro cuentaDeAhorro  = listaCuentaDeAhorro.get(i);
                    cuentaDeAhorro.retirar(cantRe);
                
                }else if(tipo.equals("Cuenta De Inversion")){
                    CuentaDeInversion cuentaDeInversion = listaCuentaDeInversion.get(i);
                    cuentaDeInversion.retirar(cantRe);
            }
               
           } catch(IndexOutOfBoundsException e){
               JOptionPane.showMessageDialog(this, "Ingrese un numero de Cuenta Valido\n Verifique los Registros si es Necesario", "Error", JOptionPane.ERROR_MESSAGE);
                return;
           }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Retiro de: $"+ cant + " completado");
        clearEntriesRe();
    }//GEN-LAST:event_btnRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Frm5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnFrmRet;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnFrmDep;
    private javax.swing.JButton btnMostrarRegistros;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JComboBox<String> cboTipoDe;
    private javax.swing.JComboBox<String> cboTipoRe;
    private javax.swing.JFrame frmDeposito;
    private javax.swing.JFrame frmRegistros;
    private javax.swing.JFrame frmRetiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblTipo2;
    private javax.swing.JLabel lblVelMax;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNumCuenDe;
    private javax.swing.JTextField txtNumCuenRe;
    private javax.swing.JTextField txtRetiro;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
