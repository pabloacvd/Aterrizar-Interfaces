package ar.com.xeven;

import java.util.Collection;

public abstract class Hospedaje implements Reservable, LowCost{

    @Override
    public void informarPrecio() {
        LowCost.super.informarPrecio();
    }
}
