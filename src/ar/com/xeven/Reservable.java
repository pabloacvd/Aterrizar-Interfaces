package ar.com.xeven;

public interface Reservable {
    default void reservar(){
        System.out.println("Reserva confirmada!");
    }
}
