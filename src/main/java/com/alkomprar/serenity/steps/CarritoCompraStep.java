package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.CarritoCompraPageObject;
import com.alkomprar.serenity.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.util.Random;

public class CarritoCompraStep {

    CarritoCompraPageObject carrito = new CarritoCompraPageObject();

    @Step("abrir navegador")
    public void abrirUrl() {

        carrito.open();
    }

    @Step("Seleccionar un producto aleatorio")
    public void seleccionarProductoAleatorio() {

        //EsperaImplicita.esperaImplicita(7);

        int tamanoArregloArticulos = carrito.liProducto.size();
        Random random = new Random();
        int indiceDelProducto = random.nextInt(tamanoArregloArticulos);
        carrito.liProducto.get(indiceDelProducto).click();


    }
    @Step("selecciona el primer producto ")
    public void seleccionarEstatico() {
        EsperaImplicita.esperaImplicita(4);
        carrito.inputSubCategoria.click();
    }

}
