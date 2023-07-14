/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Usuario
 */
public class ShopFacade {
    
    String tipoServicio;  
    private  ServicePhone phone;
    private ServiceWeb web;
    private serviceMovil Movil;

    public ShopFacade(String tipoServicio, ServicePhone phone, ServiceWeb web, serviceMovil Movil) {
        this.tipoServicio = tipoServicio;
        this.phone = phone;
        this.web = web;
        this.Movil = Movil;
    }

    public void llamar(String numero){
        Movil.Llamar(numero);
    }

}





