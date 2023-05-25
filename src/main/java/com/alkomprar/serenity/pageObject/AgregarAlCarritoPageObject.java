package com.alkomprar.serenity.pageObject;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarAlCarritoPageObject extends PageObject {

    By btnAgregar = By.xpath("(//button[@id='addToCartButton'])[1]");

    By txtTitulo = By.xpath("(//div[@class='new-container__header__title'] )[1]");

    By btnIrCarrito = By.xpath("//a[@class='button-primary js-animateBeforeSend js-delayLocation']");

    public By getBtnIrCarrito() {
        return btnIrCarrito;
    }

    public By getTxtTitulo() {
        return txtTitulo;
    }

    public By getBtnAgregar() {
        return btnAgregar;
    }
}
