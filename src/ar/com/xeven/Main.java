package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

/*
El sistema de viajes Aterrizar.com tiene transportes y hospedajes
 que ofrece a sus usuarios.
Hay aviones, trenes y colectivos como transportes que ofrecen venta
 de pasajes. Los autos pueden alquilarse o reservarse.
También tienen hoteles, casas y departamentos como hospedaje.
Y excursiones que se pueden reservar.
Los aviones, hoteles y colectivos lowcost se los puede regatear y
baja un 20% el precio.
 */
public class Main {

    public static void main(String[] args) {
	    List<Transporte> transportes = new ArrayList<>();
        List<Hospedaje> hospedajes = new ArrayList<>();
        List<Excursion> excursiones = new ArrayList<>();

        transportes.add(new TransportePrivado("auto"));
        transportes.add(new TransportePublico("avion"));

        hospedajes.add(new Casa());
        hospedajes.add(new Departamento());
        hospedajes.add(new Hotel());


        TransportePrivado auto = new TransportePrivado("mi auto");
        Hotel hotel = new Hotel();

        hotel.reservar();

        //usuario.regatear(hotel);

        auto.reservar();

    }
}
