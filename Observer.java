/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.List;

/**
 *
 * @author tracy
 */
public class Observer {

    private String nombre;
    private String email;
    private String telefono;
    private List<Suscripcion> suscripciones;

    public Observer(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.suscripciones = suscripciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(List<Suscripcion> suscripciones) {
        this.suscripciones = suscripciones;
    }

    void update(String tipoNotificacion, String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
