package com.gleb.ta.tests;

import com.gleb.ta.page.ProductPage;
import org.testng.annotations.Test;

public class ProductPageTest extends CommonConditions {

    //добавление товара в корзину
    @Test
    public void addToCart() throws InterruptedException {
        new ProductPage(driver)
                .openProductPage()
                .addToCart();
    }

    //удаление товара из корзины
    @Test
    public void DelToCart() throws InterruptedException {
        new ProductPage(driver)
                .openProductPage()
                .DelToCart();
    }
}
