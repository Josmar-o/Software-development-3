/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Frm;
import Clases.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Omar Garcia
 */
public class FrmRegistro extends javax.swing.JDialog {
    public FrmRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    }
    Automovil automovil;
    Camion camion;
    Motocicleta motocicleta;

    public String tipoDeVehiculo, marca, modelo, rutaImagen, rutaDestino = "";
    public double precioPorDia;
    public int anioSeleccionado;
    private void cleanTxt(){
        txtMarca.setText("");
        txtModelo.setText("");
        txtPrecioPorDia.setText((""));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public static void copiarArchivo(String rutaImagen, String rutaDestino) {
        Path pathImagen = Paths.get(rutaImagen);
        Path pathDestino = Paths.get(rutaDestino);

        try {
            
            if (Files.exists(pathDestino)) {
                JOptionPane.showMessageDialog(null, "El archivo ya existe en la ubicación de destino.");
            } else {
                
                Files.copy(pathImagen, pathDestino);
            }
        } catch (IOException ex) {
            
            System.err.println("Error al copiar el archivo: " + ex.getMessage());
        }
    }
    private boolean esNumeroValido(String texto) {
    try {
        double pruebaPrecioDia = Double.parseDouble(texto);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    }
    
 public static void cargarDatosVehiculo(String tipoDeVehiculo, String marca, String modelo, int anio, double precioPorDia, String imagenPath) {
         final String URL = "jdbc:mysql://localhost:3306/gestiondevehiculos";
         final String USUARIO = "root";
        final String CONTRASENA = "0000";

        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            // Sentencia SQL para insertar un nuevo registro en la tabla Vehiculos
            String sql = "INSERT INTO Vehiculos (TipoDeVehiculo, Marca, Modelo, Anio, PrecioPorDia, ImagenPath) " +
                         "VALUES (?, ?, ?, ?, ?, ?)";

            statement = conexion.prepareStatement(sql);
            statement.setString(1, tipoDeVehiculo);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setInt(4, anio);
            statement.setDouble(5, precioPorDia);
            statement.setString(6, imagenPath);

            int filasInsertadas = statement.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("Se ha agregado un nuevo registro a la tabla Vehiculos.");
            } else {
                System.out.println("No se pudo agregar el registro.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar datos del vehículo a la base de datos: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
 
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radAuto = new javax.swing.JRadioButton();
        radMoto = new javax.swing.JRadioButton();
        radCamion = new javax.swing.JRadioButton();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cbAnio = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioPorDia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Vehiculos");

        jLabel2.setText("Tipo de Vehiculo");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        jLabel5.setText("Año");

        buttonGroup1.add(radAuto);
        radAuto.setText("Automovil");
        radAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAutoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radMoto);
        radMoto.setSelected(true);
        radMoto.setText("Motocicleta");

        buttonGroup1.add(radCamion);
        radCamion.setText("Camion");

        cbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", " " }));
        cbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnioActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Imagen");

        jButton2.setText("Seleccionar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio Por Dia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(radAuto)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(radMoto)))
                        .addGap(18, 18, 18)
                        .addComponent(radCamion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo)
                            .addComponent(txtMarca)
                            .addComponent(jButton2)
                            .addComponent(txtPrecioPorDia, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radAuto)
                    .addComponent(radMoto)
                    .addComponent(radCamion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radAutoActionPerformed

    private void cbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnioActionPerformed
        // TODO add your handling code here:
        String itemSeleccionado = cbAnio.getSelectedItem().toString();
        if(itemSeleccionado != null){
            anioSeleccionado = Integer.valueOf(itemSeleccionado);
        }
    }//GEN-LAST:event_cbAnioActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if (txtMarca.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "El campo Marca está vacío");
    } else if (txtModelo.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "El campo Modelo está vacío");
    } else if (txtPrecioPorDia.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "El campo Precio por Día está vacío");
    } else {
        String precioPorDiaTexto = txtPrecioPorDia.getText();
        if (!esNumeroValido(precioPorDiaTexto)) {
            JOptionPane.showMessageDialog(rootPane, "El campo Precio Por Día debe contener un número válido");
        } else {
            try {
                precioPorDia = Double.parseDouble(precioPorDiaTexto);
                marca = txtMarca.getText();
                modelo = txtModelo.getText();
                if (radAuto.isSelected()) {
                    tipoDeVehiculo = "Automovil";
                    automovil = new Automovil(marca, modelo, anioSeleccionado, precioPorDia);
                } else if (radCamion.isSelected()) {
                    tipoDeVehiculo = "Camion";
                    camion = new Camion(marca, modelo, anioSeleccionado, precioPorDia);
                } else if (radMoto.isSelected()) {
                    tipoDeVehiculo = "Motocicleta";
                    motocicleta = new Motocicleta(marca, modelo, anioSeleccionado, precioPorDia);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Se ha presentado un error");
            }
            Path pathImagen = Paths.get(rutaImagen);
            String nombreArchivo = pathImagen.getFileName().toString();
            String rutaDestino = ".\\src\\ImgVehiculos\\" + nombreArchivo;
            copiarArchivo(rutaImagen, rutaDestino);
            cargarDatosVehiculo(tipoDeVehiculo, marca, modelo, anioSeleccionado, precioPorDia, rutaDestino);
            cleanTxt();
        }
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "png", "jpeg");
            fileChooser.setFileFilter(filter);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                rutaImagen = fileChooser.getSelectedFile().getPath();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistro dialog = new FrmRegistro((FrmVehiculos) new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAnio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton radAuto;
    private javax.swing.JRadioButton radCamion;
    private javax.swing.JRadioButton radMoto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecioPorDia;
    // End of variables declaration//GEN-END:variables
}