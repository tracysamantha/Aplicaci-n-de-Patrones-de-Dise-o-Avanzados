/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author tracy
 */
public class Notificacion {

    private Observer destinatario;
    private String contenido;

    public Notificacion(Observer destinatario, String contenido) {
        this.destinatario = destinatario;
        this.contenido = contenido;
    }

    public void enviarNotificacion(String medio) {
        System.out.println("Notificacion enviada a " + destinatario.getNombre() + " por " + medio + ": " + contenido);
    }

    public Observer getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Observer destinatario) {
        this.destinatario = destinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
