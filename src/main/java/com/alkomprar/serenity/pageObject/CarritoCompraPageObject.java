package com.alkomprar.serenity.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.alkomprar.com/")

public class CarritoCompraPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//a[starts-with(@class, 'js-algolia-product-click js-algolia-product-title')]")
    public List<WebElementFacade> liProducto;

    @FindBy(how = How.XPATH, using = "//a[@class='js-algolia-product-click js-algolia-product-title']") //Estatico
    public WebElementFacade inputSubCategoria;
}
