/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

/**
 *
 * @author jaira
 */
public class BaseDecorator extends Notificador{
    private Notificador envoltorio;
    
    public BaseDecorator(Notificador envoltorio){
        this.envoltorio = envoltorio;
    }
    public void send(String message){
        //logica para enviar mensaje
    }
}
