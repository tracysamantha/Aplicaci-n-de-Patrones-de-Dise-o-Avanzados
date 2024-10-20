/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author tracy
 */
class Suscripcion {
    private String tipoNotificacion; 
    private Observer observador;
    private String estado;

    public Suscripcion(String tipoNotificacion, Observer observador, String estado) {
        this.tipoNotificacion = tipoNotificacion;
        this.observador = observador;
        this.estado = estado; 
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public Observer getObservador() {
        return observador;
    }

    public void setObservador(Observer observador) {
        this.observador = observador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
