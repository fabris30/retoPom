package com.alkomprar.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarProductoPageObject extends PageObject {

    By txtNombreProducto= By.xpath("(//div[@class='new-container__header__title'])[1]");


    public By getTxtNombreProducto() {
        return txtNombreProducto;
    }


}
