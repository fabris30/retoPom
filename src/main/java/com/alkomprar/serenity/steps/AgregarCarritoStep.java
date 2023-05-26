package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.AgregarAlCarritoPageObject;
import com.alkomprar.serenity.utils.EsperaImplicita;
import com.alkomprar.serenity.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class AgregarCarritoStep {
    Scroll scroll = new Scroll();
    AgregarAlCarritoPageObject agregarAlCarritoPageObject=new AgregarAlCarritoPageObject();
    @Step("agregar producto al carrito")
    public void agregarCarrito() {

        scroll.scrollElemento(agregarAlCarritoPageObject.getDriver(),agregarAlCarritoPageObject.getTxtTitulo());

        agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getBtnAgregar()).click();
    }
    @Step("ir al carrito")
    public void irCarrito(){
        EsperaImplicita.esperaImplicita(4);
        agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getBtnIrCarrito()).click();
    }
}
