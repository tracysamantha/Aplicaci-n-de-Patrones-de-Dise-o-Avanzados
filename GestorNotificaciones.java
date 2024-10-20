/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tracy
 */
public class GestorNotificaciones {
    private Map<String, List<Observer>> suscriptores = new HashMap<>();

    public void suscribirObserver(String tipoNotificacion, Observer observador) {
        suscriptores.putIfAbsent(tipoNotificacion, new ArrayList<>());
        suscriptores.get(tipoNotificacion).add(observador);
    }

    public void eliminarSuscripcion(String tipoNotificacion, Observer observador) {
        if (suscriptores.containsKey(tipoNotificacion)) {
            suscriptores.get(tipoNotificacion).remove(observador);
        }
    }

    public void notificar(String tipoNotificacion, String data) {
        if (suscriptores.containsKey(tipoNotificacion)) {
            for (Observer observador : suscriptores.get(tipoNotificacion)) {
                observador.update(tipoNotificacion, data);
            }
        }
    }
}
