package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.ValidarProductoPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ValidarProductoStep {
    ValidarProductoPageObject validarProductoPageObject= new ValidarProductoPageObject();

    @Step
    public void validarProducto (){
        Assert.assertThat(validarProductoPageObject.getDriver()
                .findElement(validarProductoPageObject.getTxtNombreProducto())
                .isDisplayed(), Matchers.is(true));
    }
}
