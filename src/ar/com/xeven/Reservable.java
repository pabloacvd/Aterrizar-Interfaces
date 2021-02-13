package ar.com.xeven;

public interface Reservable {
    default void reservar(){
        System.out.println("Reserva confirmada!");
    }

    default void informarPrecio(){
        System.out.println("Soy caro pero lo valgo");
    }
}
