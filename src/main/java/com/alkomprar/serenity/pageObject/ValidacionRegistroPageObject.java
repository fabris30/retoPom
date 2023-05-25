package com.alkomprar.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionRegistroPageObject extends PageObject {
    By lblMiCuenta = By.xpath("//div[@class='account-section-header visible module-title']");

    public By getLblMiCuenta() {
        return lblMiCuenta;
    }
}
