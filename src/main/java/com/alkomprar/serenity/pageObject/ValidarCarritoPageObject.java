package com.alkomprar.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarCarritoPageObject extends PageObject {

    By txtNombreProducto = By.xpath("//span[@class='item__name']");

    public By getTxtNombreProducto() {
        return txtNombreProducto;
    }
}
