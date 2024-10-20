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

    private GestorNotificaciones gestorNotificaciones;

    public Notificador(GestorNotificaciones gestorNotificaciones) {
        this.gestorNotificaciones = gestorNotificaciones;
    }

    public void generarEvento(String tipoNotificacion, String data) {
        gestorNotificaciones.notificar(tipoNotificacion, data);
    }
}
