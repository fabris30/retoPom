package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.CarritoCompraPageObject;
import com.alkomprar.serenity.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;


public class CarritoCompraStep {

    CarritoCompraPageObject carrito = new CarritoCompraPageObject();

    @Step("abrir navegador")
    public void abrirUrl() {

        carrito.open();
    }

    @Step("selecciona un producto ")
    public void seleccionarProducto() {
        EsperaImplicita.esperaImplicita(4);
        carrito.liProducto.click();
    }

}
