package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.CargarProductoPageObject;
import com.alkomprar.serenity.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class CargarProductoStep {


    CargarProductoPageObject  cargarProductoPageObject= new CargarProductoPageObject();
    @Step("Escribir nombre de producto")
    public void escribirProducto() {
        cargarProductoPageObject.inputBusqueda.typeAndEnter("celulares");

    }
    @Step("abrir navegador")
    public void abrirUrlCelular() {
        cargarProductoPageObject.open();
    }


}
