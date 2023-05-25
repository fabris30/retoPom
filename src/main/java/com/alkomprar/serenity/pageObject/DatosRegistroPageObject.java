package com.alkomprar.serenity.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class DatosRegistroPageObject extends PageObject {
   By txtNombres = By.id("register.firstName");
   By txtApellidos = By.id("register.lastName");
    By txtCelular = By.id("register.mobileNumber");
    By chkTerminosCondiccion = By.xpath("//label[@for='registerChkTermsConditions']");

    By btnContinuar = By.xpath("//button[@class='button-primary btn-block js-btn-register-myaccount']");

    public By getTxtNombres() {
        return txtNombres;
    }

    public By getTxtApellidos() {
        return txtApellidos;
    }

    public By getTxtCelular() {
        return txtCelular;
    }

    public By getChkTerminosCondiccion() {
        return chkTerminosCondiccion;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
