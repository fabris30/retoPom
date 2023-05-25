package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.ValidarCarritoPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ValidarCarritoStep {

    ValidarCarritoPageObject validarCarritoStep=new ValidarCarritoPageObject();

    @Step
    public void validarCarrito (){
        Assert.assertThat(validarCarritoStep.getDriver()
                .findElement(validarCarritoStep.getTxtNombreProducto())
                .isDisplayed(), Matchers.is(true));
    }
}
