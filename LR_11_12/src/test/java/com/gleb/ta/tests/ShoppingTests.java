package com.gleb.ta.tests;

import com.gleb.ta.page.ProductPage;
import com.gleb.ta.page.ShoesPage;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class ShoppingTests extends CommonConditions {

    //изменение валюты
    @Test
    public void changeCurrency() throws InterruptedException {
        new ProductPage(driver)
                .openPage()
                .changeCurrency();
    }
    //изменение категории по полу
    @Test
    public void changeSex() throws  InterruptedException{
        new ShoesPage(driver)
                .openPage()
                .changeSex();
    }
}
