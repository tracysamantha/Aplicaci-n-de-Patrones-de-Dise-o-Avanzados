/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author tracy
 */
public class Main {
    public static void main(String[] args) {
        GestorNotificaciones gestor=new GestorNotificaciones();
        
        Observer observador1 = new Observer("Tracy", "tracyhuaman@email.com","234 567 890" );
        Observer observador2 = new Observer("Lia", "liahumareda@email.com","123456789" );
        
        gestor.suscribirObserver("Su fecha para regresar el/los libros esta por expirar", observador1);
        gestor.suscribirObserver("Adquiere los nuevos libros!", observador2);
        gestor.suscribirObserver("Aumenta tu tiempo para regresar el libro que te llevaste!", observador1);
        
        Notificacion notificacion1 = new Notificacion (observador1,"Tu libro vence en 2 dias\n" );
        Notificacion notificacion2= new Notificacion (observador2,"El nuevo libro del gato con botas, llegara en solo 4 dias\n" );
        notificacion1.enviarNotificacion("Email");
        notificacion2.enviarNotificacion("Email");
    }
}
