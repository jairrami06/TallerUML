/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TarjetaCredito;

import modelo.Cliente;
import modelo.TipoCliente;

/**
 *
 * @author jaira
 */
public class CreadorTarj {
    public TarjetaCredito crearTarjeta(Cliente c){
        TarjetaCredito tc = null; 
        switch (c.getTipo()) {
            case BASICO:
                tc = new CreadorTarjBasica().crearTarjeta();
                break;
            case PREMIUM:
                tc = new CreadorTarjPremium().crearTarjeta();
                break;
            case VIP:
                tc = new CreadorTarjVIP().crearTarjeta();
                break;
            default:
                break;
        }
        return tc;
    }
}
