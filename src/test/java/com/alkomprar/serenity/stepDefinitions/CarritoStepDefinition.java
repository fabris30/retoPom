package com.alkomprar.serenity.stepDefinitions;

import com.alkomprar.serenity.steps.*;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

public class CarritoStepDefinition {

    @Steps
    CarritoCompraStep carritoCompraStep;
    @Steps
    CargarProductoStep cargarProductoStep;
    @Steps
    ValidarProductoStep validarProductoStep;
    @Steps
    AgregarCarritoStep agregarCarritoStep;
    @Steps
    ValidarCarritoStep validarCarritoStep;


    @Dado("^que el usuario se encuentra registrado en la pagina$")
    public void queElUsuarioSeEncuentraRegistradoEnLaPagina() {


    }


    @Cuando("^se busque un producto en la barra de busqueda$")
    public void seBusqueUnProductoEnLaBarraDeBusqueda() {

        cargarProductoStep.escribirProducto();
        cargarProductoStep.abrirUrlCelular();


    }

    @Cuando("^se agregue de forma aleatoria al carrito de compra$")
    public void seAgregueDeFormaAleatoriaAlCarritoDeCompra() {

        //carritoCompraStep.seleccionarEstatico();
        carritoCompraStep.seleccionarProductoAleatorio();
        validarProductoStep.validarProducto();
        agregarCarritoStep.agregarCarrito();
        agregarCarritoStep.irCarrito();

    }

    @Entonces("^se visualizara el producto en el carrito$")
    public void seVisualizaraElProductoEnElCarrito() {
        validarCarritoStep.validarCarrito();

    }
}
