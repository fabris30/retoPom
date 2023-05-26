package com.alkomprar.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.alkomprar.com/")
public class RegistroUsuarioPageObject extends PageObject {

    By btnMiCuenta= By.id("js-myaccount-header");

    By txtCorrreo= By.id("js-login-email");

    By btnContinuar= By.id("js-login-continue");


    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

    public By getTxtCorrreo() {
        return txtCorrreo;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
