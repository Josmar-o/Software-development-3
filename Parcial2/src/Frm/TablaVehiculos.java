package Frm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.table.TableRowSorter;

public class TablaVehiculos extends JFrame {
    private JTable tabla;
    private JTextField filtroModelo;
    private JButton botonFiltrar;
    private JButton botonCerrar, botonVerImagen;
    private DefaultTableModel modeloTabla;

    public TablaVehiculos() {
        super("Tabla de Vehículos");

  
        tabla = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabla);
        filtroModelo = new JTextField(20);
        botonFiltrar = new JButton("Filtrar por Modelo");
   
        botonVerImagen = new JButton("Ver Imagen");


        setLayout(new BorderLayout());
        JPanel panelFiltro = new JPanel();
        panelFiltro.add(new JLabel("Filtrar por Modelo:"));
        panelFiltro.add(filtroModelo);
        panelFiltro.add(botonFiltrar);

        panelFiltro.add(botonVerImagen);

        add(panelFiltro, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);

        // Cargar los datos de la base de datos en la tabla
        cargarDatosTabla();

        botonFiltrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String modeloAFiltrar = filtroModelo.getText().trim();
                filtrarPorModelo(modeloAFiltrar);
            }
        });

        
        botonVerImagen.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) { // Verificar si se ha seleccionado una fila
            String rutaImagen = (String) tabla.getValueAt(filaSeleccionada, 6);
            mostrarImagen(rutaImagen);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para ver la imagen.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
});
        
       
    }
private void mostrarImagen(String rutaImagen) {
    try {
        File archivoImagen = new File(rutaImagen);
        if (!archivoImagen.exists()) {
            throw new IOException("Archivo no encontrado: " + rutaImagen);
        }
        
        BufferedImage imagenOriginal = ImageIO.read(archivoImagen);
        if (imagenOriginal == null) {
            throw new IOException("Formato de imagen no compatible: " + rutaImagen);
        }

        int anchoMaximo = 800;
        int altoMaximo = 450;
        Image imagenEscalada = imagenOriginal.getScaledInstance(anchoMaximo, altoMaximo, Image.SCALE_SMOOTH);

        ImageIcon icono = new ImageIcon(imagenEscalada);
        JLabel etiquetaImagen = new JLabel(icono);
        JOptionPane.showMessageDialog(null, etiquetaImagen, "Imagen", JOptionPane.PLAIN_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    private void cargarDatosTabla() {
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondevehiculos", "root", "Password-19")) {
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM Vehiculos";
            ResultSet resultSet = statement.executeQuery(sql);

           
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnas = metaData.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                modeloTabla.addColumn(metaData.getColumnName(i));
            }

          
            while (resultSet.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 1; i <= columnas; i++) {
                    fila[i - 1] = resultSet.getObject(i);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos de la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void filtrarPorModelo(String modelo) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
        tabla.setRowSorter(sorter);
        if (modelo.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + modelo)); // Ignorar mayúsculas y minúsculas
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TablaVehiculos ventana = new TablaVehiculos();
            ventana.setVisible(true);
        });
    }
}
