/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TarjetaCredito;

/**
 *
 * @author jaira
 */
public abstract class TarjetaCredito {
    protected double limiteCredito;
    protected double costoAnual;
    
    public TarjetaCredito(double limiteCredito, double costoAnual){
        this.limiteCredito = limiteCredito;
        this.costoAnual = costoAnual;
    }
}
