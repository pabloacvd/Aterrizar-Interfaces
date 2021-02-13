package ar.com.xeven;

public interface LowCost {

    default void bajarPrecio(){
        System.out.println("Ok, te lo bajo porque es sábado");
    }

    default void informarPrecio(){
        System.out.println("No soy tan caro pero puedo bajar aún más.");
    }

}
