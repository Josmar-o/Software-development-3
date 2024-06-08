/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejodearhivos;
import java.io.File;

/**
 *
 * @author omargarcia
 */
public class ManejoDeArchivos {
    private String unidad;
    private String carpeta;
    private String archivo;
    private boolean sobreescribir;
    private String rutaCompleta;
    private File file;
    
    public ManejoDeArchivos(){
        
    }

    public ManejoDeArchivos(String unidad, String carpeta, String archivo, boolean sobreescribir) {
        this.unidad = unidad;
        this.carpeta = carpeta;
        this.archivo = archivo;
        this.sobreescribir = sobreescribir;
        this.rutaCompleta = unidad + "//" + carpeta + "//" + archivo;
                 
    }
    
    public void hayCarpeta(){
        if (!new File(unidad  + "//" + carpeta).exists()){
        new File(unidad + "//" + carpeta).mkdir();
    }
    }
    
    
    
}
