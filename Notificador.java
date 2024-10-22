/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author tracy
 */
public class Notificador {
    private String tipoNotificacion;
    private GestorNotificaciones gestorNotificaciones;

    public Notificador(GestorNotificaciones gestorNotificaciones) {
        this.gestorNotificaciones = gestorNotificaciones;
    }
    public void notificarObserver(String tipoNotificacion, String data) {
        gestorNotificaciones.notificar(tipoNotificacion, data);
    }

    public void generarEvento(String tipoNotificacion, String data) {
        System.out.println("Generando evento de tipo: " + tipoNotificacion);
        notificarObserver(tipoNotificacion, data);
    }
}
