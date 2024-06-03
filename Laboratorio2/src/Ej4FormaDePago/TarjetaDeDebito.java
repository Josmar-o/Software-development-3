  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4FormaDePago;

import java.time.LocalDate;

/**
 *
 * @author omargarcia
 */
public class TarjetaDeDebito extends FormaDePago{

    
    public TarjetaDeDebito(){
        
    }

    public TarjetaDeDebito(double cantidad, LocalDate fechaDeTrans, boolean online) {
        super(cantidad, fechaDeTrans, online);
        setTipoDePago("Tarjeta de Debito");
    }
    
    
  
}
