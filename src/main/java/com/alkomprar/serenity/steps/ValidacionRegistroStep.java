package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.ValidacionRegistroPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;



public class ValidacionRegistroStep {
    ValidacionRegistroPageObject validacion =new ValidacionRegistroPageObject();

    @Step
    public void validacionRegistroUsuario (){
        Assert.assertThat(validacion.getDriver()
                .findElement(validacion.getLblMiCuenta())
                .isDisplayed(), Matchers.is(true));
    }
}
