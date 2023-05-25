package com.alkomprar.serenity.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.alkomprar.com/search/?text=celulares")
public class CargarProductoPageObject extends PageObject {

    @FindBy(how = How.ID, using = "js-site-search-input")
    public WebElementFacade inputBusqueda;

}
